package com.nn.logutil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nn.logn.LogUtils;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        installTimber();
        LogUtils.d("hello");
//        Timber.d("hello");
//        Timber.e(new NullPointerException("自定义"),"异常报错测试");
//        Timber.tag("AAAA").d("hello");
    }
    private void installTimber() {
        LogUtils.getConfig(this).setConsoleFilter(LogUtils.D);
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected void log(int priority, String tag, String message, Throwable t) {
                LogUtils.log(priority, tag, message, t);
            }
        });
    }
}
