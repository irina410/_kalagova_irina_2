package com.example.kalagovairina2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Lifecycle", "onCreate() in MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Lifecycle", "onStart() in MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Lifecycle", "onResume() in MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Lifecycle", "onPause() in MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Lifecycle", "onStop() in MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Lifecycle", "onDestroy() in MainActivity");
    }
}