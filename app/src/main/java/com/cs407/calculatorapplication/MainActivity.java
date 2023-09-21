package com.cs407.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view) {
        EditText num1 = (EditText) findViewById(R.id.textView2);
        EditText num2 = (EditText) findViewById(R.id.textView3);
        Integer result = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());

        goToCalculatorResult(String.valueOf(result));
    }

    public void subtraction(View view) {
        EditText num1 = (EditText) findViewById(R.id.textView2);
        EditText num2 = (EditText) findViewById(R.id.textView3);
        Integer result = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());

        goToCalculatorResult(String.valueOf(result));
    }

    public void multiplication(View view) {
        EditText num1 = (EditText) findViewById(R.id.textView2);
        EditText num2 = (EditText) findViewById(R.id.textView3);
        Integer result = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());

        goToCalculatorResult(String.valueOf(result));
    }

    public void division(View view) {
        EditText num1 = (EditText) findViewById(R.id.textView2);
        EditText num2 = (EditText) findViewById(R.id.textView3);

        if (Integer.parseInt(num2.getText().toString()) == 0) {
            goToCalculatorResult("Can't Divide by 0");
        } else {
            Integer result = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
            goToCalculatorResult(String.valueOf(result));
        }
    }

    public void goToCalculatorResult(String s1) {
        Intent intent = new Intent(this, CalculatorResult.class);
        intent.putExtra("message", s1);
        startActivity(intent);
    }
}