package com.yanzhilong.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // new code
    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String getMsgFromJni();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.jni_msgView)).setText(getMsgFromJni());
    }
}
