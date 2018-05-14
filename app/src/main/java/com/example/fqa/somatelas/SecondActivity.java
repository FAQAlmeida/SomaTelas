package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
            if(!TextUtils.isEmpty(txtNum2.getText()) && new Util().tryParse(txtNum2.getText())) {
                if(txtNum2.getText().toString().startsWith(".")) txtNum2.setText(txtNum2.getText().insert(0, "0"));
                if(txtNum2.getText().toString().endsWith(".")) txtNum2.setText(txtNum2.getText().insert(txtNum2.getText().length(), "0"));
                Intent intent = new Intent(SecondActivity.this, FinalActivity.class);
                Intent pastIntent = getIntent();
                intent.putExtra("Num2", txtNum2.getText().toString());
                intent.putExtra("Num1.1", pastIntent.getStringExtra("Num1"));
                startActivity(intent);
            }else{
                txtNum2.setError("Digite algum número para continuar");
                Toast.makeText(SecondActivity.this, "Digite algum número para continuar", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
