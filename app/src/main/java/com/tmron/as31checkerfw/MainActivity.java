package com.tmron.as31checkerfw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tmron.androidlib.AndroidLibClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText(AndroidLibClass.toNullable("input"));
    }
}
