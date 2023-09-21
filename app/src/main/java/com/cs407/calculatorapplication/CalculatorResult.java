package com.cs407.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);
        TextView textView = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText(str);
    }
}