package com.example.andre.mailvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements EvenCallback{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText=findViewById(R.id.inputEt);
        textView=findViewById(R.id.validationTv);

        Button button=findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= textView.getText().toString();

                new EvenCalculation(MainActivity.this).evenCalculation(value);


            }
        });

    }

    @Override
    public void evenResult(String value) {
        textView.setText("Contraseña valida");


    }

    @Override
    public void blankInput() {
        textView.setText("La contraseña no cumple con el minimo de 8 caracteres");

    }
}
