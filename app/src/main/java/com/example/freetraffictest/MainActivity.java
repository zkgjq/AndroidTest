package com.example.freetraffictest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "测试弹窗1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试弹窗2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试弹窗3", Toast.LENGTH_SHORT).show();
    }
}