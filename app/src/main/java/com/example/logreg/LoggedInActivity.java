package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    }
}