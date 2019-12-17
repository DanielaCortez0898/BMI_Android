package com.example.bmiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class activity_main2 extends AppCompatActivity {
    Bundle bundle;
    EditText lblresultadoIMC;
    TextView lblresultadoCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lblresultadoIMC = (EditText) findViewById(R.id.lblresultadoIMC);
        lblresultadoCategoria = (TextView) findViewById(R.id.lblresultadoCategoria);

        bundle = getIntent().getExtras();
        String IMC = bundle.getString("resultadoIMC");
        lblresultadoIMC.setText(IMC);
        String Categoria = bundle.getString("resultadoCategoria");
        lblresultadoCategoria.setText(Categoria);
    }
}
