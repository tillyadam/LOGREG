package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_FelNevVEmail, EditText_Jelszo;
    private Button Button_Bejelentkezes, Button_Regisztracio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        EditText_FelNevVEmail = findViewById(R.id.EditText_FelNevVEmail);
        EditText_Jelszo = findViewById(R.id.EditText_Jelszo);
        Button_Bejelentkezes = findViewById(R.id.Button_Bejelentkezes);
        Button_Regisztracio = findViewById(R.id.Button_Regisztracio);
    }
}