package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {
    private TextView TextView_TeljesNev;
    private Button Button_Kijelentkezes;
    private dbhelper adatbazis;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        init();

        String felhasznalonev = sharedPreferences.getString("felhasznalonev", "");
        String jelszo = sharedPreferences.getString("jelszo", "");
        Cursor teljesnev = adatbazis.login(felhasznalonev, jelszo);

        Button_Kijelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityre = new Intent(LoggedInActivity.this, MainActivity.class);
                startActivity(mainActivityre);
                finish();
            }
        });
    }

    private void init() {
        TextView_TeljesNev = findViewById(R.id.TextView_TeljesNev);
        Button_Kijelentkezes = findViewById(R.id.Button_Kijelentkezes);
        adatbazis = new dbhelper(LoggedInActivity.this);
        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
}