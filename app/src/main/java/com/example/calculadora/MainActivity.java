package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Spinner spinner3;
    int num1;
    int num2;
    int resultado;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner3 = findViewById(R.id.spinner3);
        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void calcular(View v){
        num1 = Integer.valueOf(numero1.getText().toString());
        num2 = Integer.valueOf(numero2.getText().toString());


        if(spinner3.getSelectedItem().toString().equals("Sumar")){
            resultado = num1 + num2;
            result.setText(String.valueOf(resultado));
        }else {
            if (spinner3.getSelectedItem().toString().equals("Restar")) {
                resultado = num1 - num2;
                result.setText(String.valueOf(resultado));
            }
        }



    }
}
