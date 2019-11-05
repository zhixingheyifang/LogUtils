package com.nn.logutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nn.logn.LogUtils;

import java.util.logging.Logger;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        installTimber();
        LogUtils.v("hello");
        Timber.d("hello");
        Timber.e(new NullPointerException("自定义"),"异常报错测试");
        Timber.tag("AAAA").d("hello");
    }
    private void installTimber() {
        Timber.plant(new Timber.DebugTree() {
            @Override protected void log(int priority, String tag, String message, Throwable t) {
                LogUtils.log(priority,tag,message,t);
            }
        });
    }
}
