package com.example.activitytestapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class MyActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_layout);
    }
}
