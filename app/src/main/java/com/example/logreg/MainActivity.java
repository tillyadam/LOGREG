package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_FelNevVEmail, EditText_Jelszo;
    private Button Button_Bejelentkezes, Button_Regisztracio;
    private dbhelper adatbazis;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

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
                String felhasznalonev = EditText_FelNevVEmail.getText().toString().trim();
                String jelszo = EditText_FelNevVEmail.getText().toString().trim();

                if (felhasznalonev.length() == 0) {
                    toast("felhasználónév / e-mail");
                    return;
                } else if (jelszo.length() == 0) {
                    toast("jelszó");
                    return;
                } else if ((adatbazis.login(felhasznalonev, jelszo).getCount() == 0) || (!adatbazis.felhasznaloEllenorzes(felhasznalonev))) {
                    toastHiba();
                    return;
                } else {
                    editor.putString("felhasznalonev", felhasznalonev);
                    editor.putString("jelszo", jelszo);
                    editor.commit();
                    Intent logActivityre = new Intent(MainActivity.this, LoggedInActivity.class);
                    startActivity(logActivityre);
                    finish();
                }
            }

        });
    }

    private void init() {
        EditText_FelNevVEmail = findViewById(R.id.EditText_FelNevVEmail);
        EditText_Jelszo = findViewById(R.id.EditText_Jelszo);
        Button_Bejelentkezes = findViewById(R.id.Button_Bejelentkezes);
        Button_Regisztracio = findViewById(R.id.Button_Regisztracio);
        adatbazis = new dbhelper(MainActivity.this);
        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    private void toast(String hiba) {
        Toast.makeText(this, "Nincs megadva " + hiba + " !", Toast.LENGTH_SHORT).show();
    }

    private void toastHiba() {
        Toast.makeText(this, "Nincs ilyen felhasználó!", Toast.LENGTH_SHORT).show();
    }
}