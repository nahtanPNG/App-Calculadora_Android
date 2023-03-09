package com.example.nathan_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1Txt, num2Txt;
    TextView resultado;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adição(View view){

        num1Txt = findViewById(R.id.num1);
        num2Txt = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        if (num1Txt.getText().toString().equals("") || num2Txt.getText().toString().equals("")) {
            resultado.setText("Digite Valores Válidos");
            num1Txt.setText("");
            num2Txt.setText("");
        } else{
            num1 = Integer.parseInt(num1Txt.getText().toString());
            num2 = Integer.parseInt(num2Txt.getText().toString());
            int resposta;

            resposta = num1+num2;
            resultado.setText(String.valueOf(resposta));
            num1Txt.setText("");
            num2Txt.setText("");
        }
    }

    public void subtração(View view){

        num1Txt = findViewById(R.id.num1);
        num2Txt = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        if (num1Txt.getText().toString().equals("") || num2Txt.getText().toString().equals("")) {
            resultado.setText("Digite Valores Válidos");
            num1Txt.setText("");
            num2Txt.setText("");
        } else{
            num1 = Integer.parseInt(num1Txt.getText().toString());
            num2 = Integer.parseInt(num2Txt.getText().toString());
            int resposta;

            resposta = num1-num2;
            resultado.setText(String.valueOf(resposta));
            num1Txt.setText("");
            num2Txt.setText("");
        }
    }

    public void divisão(View view){

        num1Txt = findViewById(R.id.num1);
        num2Txt = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        if (num1Txt.getText().toString().equals("") || num2Txt.getText().toString().equals("")) {
            resultado.setText("Digite Valores Válidos");
            num1Txt.setText("");
            num2Txt.setText("");
        } else{
            num1 = Integer.parseInt(num1Txt.getText().toString());
            num2 = Integer.parseInt(num2Txt.getText().toString());
            double resposta;

            resposta = num1/num2;
            resultado.setText(String.valueOf(resposta));
            num1Txt.setText("");
            num2Txt.setText("");
        }
    }

    public void multiplicação(View view){

        num1Txt = findViewById(R.id.num1);
        num2Txt = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        if (num1Txt.getText().toString().equals("") || num2Txt.getText().toString().equals("")) {
            resultado.setText("Digite Valores Válidos");
            num1Txt.setText("");
            num2Txt.setText("");
        } else{
            num1 = Integer.parseInt(num1Txt.getText().toString());
            num2 = Integer.parseInt(num2Txt.getText().toString());
            double resposta;

            resposta = num1*num2;
            resultado.setText(String.valueOf(resposta));
            num1Txt.setText("");
            num2Txt.setText("");
        }
    }
}