package com.bayin.hencoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bayin.hencoder.view.ThumbLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ThumbLayout thumbsLayout = (ThumbLayout) findViewById(R.id.thumbLayout);
    }
}
