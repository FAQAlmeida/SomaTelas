package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText txtNum1;
    Button btnEnviar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        txtNum1 = findViewById(R.id.txtNum1);
        btnEnviar1 = findViewById(R.id.btnEnviar1);
        btnEnviar1.setOnClickListener(clickListener);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

    }private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("Num1", txtNum1.getText().toString());
            startActivity(intent);
        }
    };
}
