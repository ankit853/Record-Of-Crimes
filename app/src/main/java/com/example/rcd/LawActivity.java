package com.example.rcd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class LawActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);

        //bottom navigation view

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.law);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.innocent:
                        startActivity(new Intent(getApplicationContext(), InnocentActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.criminal:
                        startActivity(new Intent(getApplicationContext(),DashboardUserActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.law:
                        return true;
                }
                return false;
            }
        });

    }
}