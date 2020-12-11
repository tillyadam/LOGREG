package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText EditText_RegisterEmail, EditText_RegisterFelhasznalonev, EditText_RegisterJelszo, EditText_RegisterTeljesnev;
    private Button Button_RegisterRegisztracio, Button_RegisterVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();

        Button_RegisterRegisztracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText_RegisterEmail.getText().toString().trim().length() == 0) {
                    EditText_RegisterEmail.setError("Adjon meg e-mailt!");
                    return;
                }
                if (EditText_RegisterFelhasznalonev.getText().toString().trim().length() == 0) {
                    EditText_RegisterFelhasznalonev.setError("Adjon meg felhasználónevet!");
                    return;
                }
                if (EditText_RegisterJelszo.getText().toString().trim().length() == 0) {
                    EditText_RegisterJelszo.setError("Adjon meg jelszót!");
                    return;
                }
                if (EditText_RegisterTeljesnev.getText().toString().trim().length() == 0) {
                    EditText_RegisterTeljesnev.setError("Adja meg a teljesnevét!");
                    return;
                }
            }
        });
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