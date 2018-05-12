package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView lblResultado;
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();
        double num1 = Double.valueOf(intent.getStringExtra("Num11"));
        double num2 = Double.valueOf(intent.getStringExtra("Num2"));
        lblResultado = findViewById(R.id.lblResultado);
        lblResultado.setText(String.valueOf(num1 + num2));
        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(clickListener);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(FinalActivity.this, FirstActivity.class);
            startActivity(intent);
        }
    };
}
