package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText txtNum2;
    Button btnEnviar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtNum2 = findViewById(R.id.txtNum2);
        btnEnviar2 = findViewById(R.id.btnEnviar2);
        btnEnviar2.setOnClickListener(clickListener);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SecondActivity.this, FinalActivity.class);
            Intent pastIntent = getIntent();
            intent.putExtra("Num2", txtNum2.getText().toString());
            intent.putExtra("Num11", pastIntent.getStringExtra("Num1"));
            startActivity(intent);
        }
    };
}
