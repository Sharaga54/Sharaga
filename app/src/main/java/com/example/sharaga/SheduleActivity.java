package com.example.sharaga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SheduleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedule);
    }

    public void onBackBtnClick(View view) {
        Intent intent = new Intent(SheduleActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
