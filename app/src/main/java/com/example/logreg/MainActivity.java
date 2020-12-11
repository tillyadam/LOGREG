package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        Button_Regisztracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regActivityre = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(regActivityre);
                finish();
            }
        });

        Button_Bejelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logActivityre = new Intent(MainActivity.this, LoggedInActivity.class);
                startActivity(logActivityre);
                finish();
            }
        });
    }

    private void init() {
        EditText_FelNevVEmail = findViewById(R.id.EditText_FelNevVEmail);
        EditText_Jelszo = findViewById(R.id.EditText_Jelszo);
        Button_Bejelentkezes = findViewById(R.id.Button_Bejelentkezes);
        Button_Regisztracio = findViewById(R.id.Button_Regisztracio);
    }
}