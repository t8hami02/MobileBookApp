package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackButtonPress();
            }
        });
    }

    public void BackButtonPress(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}