package com.example.bmiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String resultadoIMC;
    String resultadoCategoria;
    private Button btnCalcular;
    private EditText altura;
    private EditText peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura =findViewById(R.id.txtAltura);
        peso=findViewById(R.id.txtPeso);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //OBTENER LA ALTURA

                double height = Double.parseDouble(altura.getText().toString());


                //OBTENER EL PESO

                double weight = Double.parseDouble(peso.getText().toString());

                double BMI = (weight) / (height * height);
                resultadoIMC = Double.toString(BMI);

                String BMI_Cat;
                if (BMI < 15)
                    BMI_Cat = "Very severely underweight";
                else if (BMI < 16)
                    BMI_Cat = "Severely underweight";
                else if (BMI < 18.5)
                    BMI_Cat = "Underweight";
                else if (BMI < 25)
                    BMI_Cat = "Normal";
                else if (BMI < 30)
                    BMI_Cat = "Overweight";
                else if (BMI < 35)
                    BMI_Cat = "Obese Class 1 - Moderately Obese";
                else if (BMI < 40)
                    BMI_Cat = "Obese Class 2 - Severely Obese";
                else
                    BMI_Cat = "Obese Class 3 - Very Severely Obese";

                resultadoCategoria = BMI_Cat;

                Intent intent = new Intent(MainActivity.this, activity_main2.class);
                intent.putExtra("resultadoIMC",resultadoIMC);
                intent.putExtra("resultadoCategoria",resultadoCategoria);
                startActivity(intent);
            }
        });
    }
}

