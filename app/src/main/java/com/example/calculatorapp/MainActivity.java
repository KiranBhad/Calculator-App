package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText first,second;
    TextView result;
    Button add,mul,div,sub,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        first = findViewById(R.id.firstValue);
        second = findViewById(R.id.secondValue);
        result = findViewById(R.id.result);
        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.subBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.divBtn);
        reset = findViewById(R.id.resetBtn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(first.getText().toString());
                int no2 = Integer.parseInt(second.getText().toString());

                int addition = no1 + no2;
                result.setText(String.valueOf(addition));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(first.getText().toString());
                int no2 = Integer.parseInt(second.getText().toString());

                int subtraction = no1 - no2;
                result.setText(String.valueOf(subtraction));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(first.getText().toString());
                int no2 = Integer.parseInt(second.getText().toString());

                int multiplication = no1 * no2;
                result.setText(String.valueOf(multiplication));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(first.getText().toString());
                int no2 = Integer.parseInt(second.getText().toString());

                int division = no1 / no2;
                result.setText(String.valueOf(division));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");
                second.setText("");
                result.setText("Result :");
            }
        });

    }
}