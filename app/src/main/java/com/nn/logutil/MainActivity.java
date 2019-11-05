package com.nn.logutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nn.logn.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.v("hello");
    }
}
