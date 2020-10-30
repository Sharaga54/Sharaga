package com.example.sharaga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlanBtnClick(View view) {
        Intent intent = new Intent(MainActivity.this, PlanActivity.class);
        startActivity(intent);
    }

    public void onSheduleBtnClick(View view) {
        Intent intent = new Intent(MainActivity.this, SheduleActivity.class);
        startActivity(intent);
    }
}