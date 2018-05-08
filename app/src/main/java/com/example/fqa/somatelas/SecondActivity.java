package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtNum = (EditText) findViewById(R.id.txtNum);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(clickmeth);
    }
    private View.OnClickListener clickmeth = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            Intent pastIntent = getIntent();
            intent.putExtra("Num1", pastIntent.getStringExtra("Num1"));
            intent.putExtra("Num2", txtNum.getText().toString());
        }
    };
}
