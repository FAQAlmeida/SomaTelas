package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblResultado = (TextView) findViewById(R.id.lblResultado);
        Intent intent = getIntent();
        lblResultado.setText((Integer.valueOf(intent.getStringExtra("Num1")) + Integer.valueOf(intent.getStringExtra("Num2"))));
    }
}
