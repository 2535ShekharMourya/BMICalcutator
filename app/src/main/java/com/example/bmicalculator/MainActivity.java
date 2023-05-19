package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult;
        EditText edtWeight,edtheightft,edtheigthin;
        Button btnCalculate;
        txtResult=findViewById(R.id.txtResult);
        edtheightft=findViewById(R.id.edtHeightFt);
        edtWeight=findViewById(R.id.edtWeight);
        edtheigthin=findViewById(R.id.edtHeightIN);
    }
}