package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;
    private TextView textViewMedia;
    private TextView textViewMaior;
    private TextView textViewMenor;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNota1 = findViewById(R.id.edit_text_nota1);
        editTextNota2 = findViewById(R.id.edit_text_nota2);
        editTextNota3 = findViewById(R.id.edit_text_nota3);
        textViewMedia = findViewById(R.id.text_view_media);
        textViewMaior = findViewById(R.id.text_view_maior);
        textViewMenor = findViewById(R.id.text_view_menor);
        textViewResultado = findViewById((R.id.text_view_resultado));
    }

    public void calculo(View v) {
        Double nota1 = Double.parseDouble(editTextNota1.getText().toString().replace(".", ","));
        Double nota2 = Double.parseDouble(editTextNota2.getText().toString().replace(".", ","));
        Double nota3 = Double.parseDouble(editTextNota3.getText().toString().replace(".", ","));
        Double media = ((nota1 + nota2 + nota3 ) / 3);
        textViewMedia.setText(media.toString());

        if (nota1 > nota2 && nota1 > nota3) {
            textViewMaior.setText(nota1.toString());
        }
        else if (nota2 > nota3){
            textViewMaior.setText(nota2.toString());
        }
        else {
            textViewMaior.setText(nota3.toString());
        }


        if (nota1 < nota2 && nota1 < nota3) {
            textViewMenor.setText(nota1.toString());
        }
        else if (nota2 < nota3){
            textViewMenor.setText(nota2.toString());
        }
        else {
            textViewMenor.setText(nota3.toString());
        }



        if (media >= 7) {
            textViewResultado.setText("Aprovado");
            textViewResultado.setTextColor(getResources().getColor(R.color.aprovado));
        } else if (media < 7 && media >= 5) {
            textViewResultado.setText("Recuperação");
            textViewResultado.setTextColor(getResources().getColor(R.color.recuperacao));
        } else if (media < 5) {
            textViewResultado.setText("Reprovado");
            textViewResultado.setTextColor(getResources().getColor(R.color.reprovado));
        }

    }
}
