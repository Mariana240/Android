package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button suma, resta, mult, divi;

    EditText num1, num2;

    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);

        suma = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        mult = (Button) findViewById(R.id.mult);
        divi = (Button) findViewById(R.id.div);

        resultado = (TextView) findViewById(R.id.valor);


        resta.setOnClickListener(this);
        suma.setOnClickListener(this);
        suma.setOnClickListener(this);
        suma.setOnClickListener(this);

    }




    @Override
    public void onClick(View view) {

        String n2 = num2.getText().toString();
        String n1 = num1.getText().toString();

        int entero1 = 0;
        int entero2 = 0;
        int rta =0;

        try {
            entero2 = Integer.parseInt(num2.getText().toString());
            entero1 = Integer.parseInt(num1.getText().toString());
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }


        switch (view.getId()) {

            case R.id.sumar:
                rta = entero1+entero2;
                break;
            case R.id.restar:
                rta = entero1-entero2;
                break;
            case R.id.mult:
                rta = entero1*entero2;
                break;
            case R.id.div:
                rta = entero1/entero2;
                break;

        }

        resultado.setText("" + rta);



    }





}