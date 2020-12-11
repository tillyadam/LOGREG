package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                boolean kitoltve = true;
                if (EditText_RegisterEmail.getText().toString().trim().length() == 0) {
                    EditText_RegisterEmail.setError("Adjon meg e-mailt!");
                    toast("e-mail");
                    kitoltve = false;
                    return;
                } else if (EditText_RegisterFelhasznalonev.getText().toString().trim().length() == 0) {
                    EditText_RegisterFelhasznalonev.setError("Adjon meg felhasználónevet!");
                    toast("felhasználónév");
                    kitoltve = false;
                    return;
                } else if (EditText_RegisterJelszo.getText().toString().trim().length() == 0) {
                    EditText_RegisterJelszo.setError("Adjon meg jelszót!");
                    toast("jelszó");
                    kitoltve = false;
                    return;
                } else if (EditText_RegisterTeljesnev.getText().toString().trim().length() == 0) {
                    EditText_RegisterTeljesnev.setError("Adja meg a teljes nevét!");
                    toast("teljes név");
                    kitoltve = false;
                    return;
                }

                if (kitoltve == true) {
                    EditText_RegisterEmail.getText().clear();
                    EditText_RegisterFelhasznalonev.getText().clear();
                    EditText_RegisterJelszo.getText().clear();
                    EditText_RegisterTeljesnev.getText().clear();
                    toastSikeres();
                }
            }
        });

        Button_RegisterVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityre = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(mainActivityre);
                finish();
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

    private void toast(String hiba) {
        Toast.makeText(this, "Kötelező a(z) " + hiba + " megadása!", Toast.LENGTH_SHORT).show();
    }

    private void toastSikeres() {
        Toast.makeText(this, "Sikeres regisztráció", Toast.LENGTH_SHORT).show();
    }
}