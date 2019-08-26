package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;
    private TextView textViewMedia;
    private TextView textViewMaior;
    private TextView textViewMenor;

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
    }

    public void calculo(View v){
    Double nota1 = Double.parseDouble(editTextNota1.getText().toString().replace(".",","));
    Double nota2 = Double.parseDouble(editTextNota2.getText().toString().replace(".",","));
    Double nota3 = Double.parseDouble(editTextNota3.getText().toString().replace(".",","));
    Double soma = (nota1 + nota2 + nota3);
    Double media = (soma /3);

    textViewMedia.setText(media.toString());
    }
}
