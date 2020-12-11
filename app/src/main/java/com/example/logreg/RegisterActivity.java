package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText EditText_RegisterEmail, EditText_RegisterFelhasznalonev, EditText_RegisterJelszo, EditText_RegisterTeljesnev;
    private Button Button_RegisterRegisztracio, Button_RegisterVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    private void init() {
        EditText_RegisterEmail = findViewById(R.id.EditText_RegisterEmail);
        EditText_RegisterFelhasznalonev = findViewById(R.id.EditText_RegisterFelhasznalonev);
        EditText_RegisterJelszo = findViewById(R.id.EditText_RegisterJelszo);
        EditText_RegisterTeljesnev = findViewById(R.id.EditText_RegisterTeljesnev);
        Button_RegisterRegisztracio = findViewById(R.id.Button_RegisterRegisztracio);
        Button_RegisterVissza = findViewById(R.id.Button_RegisterVissza);
    }
}