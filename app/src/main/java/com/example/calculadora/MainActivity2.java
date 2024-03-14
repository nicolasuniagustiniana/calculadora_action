package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText edit_numero_3;
    private TextView textRespuesta;
    private Button btn_factorizacion2;
    private Button btn_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit_numero_3= findViewById(R.id.numero3);
        textRespuesta = findViewById(R.id.Text_Respuesta);


        btn_factorizacion2 = findViewById(R.id.button_factorizacion2);
        btn_factorizacion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularFactorizacion();
            }
        });

        btn_atras = findViewById(R.id.button_atras);
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    private void calcularFactorizacion() {
        String numeroStr = edit_numero_3.getText().toString();
        if (!numeroStr.isEmpty()) {
            int numero = Integer.parseInt(numeroStr);
            String resultadoFactorizacion = factorizacion(numero);
            textRespuesta.setText(resultadoFactorizacion);
        } else {
            textRespuesta.setText("escribe un valor");
        }
    }

    public static String factorizacion(int n) {
        if (n <= 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                result.append(divisor).append(" ");
                n /= divisor;
            } else {
                divisor++;
            }
        }

        return result.toString();
    }
}
