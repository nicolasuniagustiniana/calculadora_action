package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private EditText edit_numero_4;
    private TextView textRespuesta;
    private Button btn_fibonacci2;
    private Button btn_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edit_numero_4= findViewById(R.id.numero4);
        textRespuesta = findViewById(R.id.text_Respuesta);


        btn_fibonacci2 = findViewById(R.id.button_fibonacci2);
        btn_fibonacci2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularfibonacci();
            }
        });

        btn_atras = findViewById(R.id.button_atras2);
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    private void calcularfibonacci() {
        String numeroStr = edit_numero_4.getText().toString();
        if (!numeroStr.isEmpty()) {
            int numero = Integer.parseInt(numeroStr);
            String resultadofibonacci = fibonacci2(numero);
            textRespuesta.setText(resultadofibonacci);
        } else {
            textRespuesta.setText("escribe un valor");
        }
    }

    public static String fibonacci2(int n) {
        StringBuilder result = new StringBuilder();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            result.append(a).append(" ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        return result.toString();
    }
}
