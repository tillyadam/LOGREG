package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {
    private TextView TextView_TeljesNev;
    private Button Button_Kijelentkezes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        init();
    }

    private void init() {
        TextView_TeljesNev = findViewById(R.id.TextView_TeljesNev);
        Button_Kijelentkezes = findViewById(R.id.Button_Kijelentkezes);
    }
}