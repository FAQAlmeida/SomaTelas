package com.example.fqa.somatelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

public class FinalActivity extends AppCompatActivity {

    TextView lblResultado;
    Button btnVoltar;
    Switch swForm;
    double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();
        num1 = Double.valueOf(intent.getStringExtra("Num1.1"));
        num2 = Double.valueOf(intent.getStringExtra("Num2"));
        lblResultado = findViewById(R.id.lblResultado);
        lblResultado.setText(String.format(Locale.ENGLISH, "%.2f", num1 + num2));
        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(clickListener);
        swForm = findViewById(R.id.swForm);
        swForm.setOnCheckedChangeListener(changeListener);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(FinalActivity.this, FirstActivity.class);
            startActivity(intent);
        }
    };
    private CompoundButton.OnCheckedChangeListener changeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked) lblResultado.setText(String.format(Locale.ENGLISH, "%.2f", num1 + num2));
            else lblResultado.setText(String.valueOf(num1 + num2));
        }
    };
}
