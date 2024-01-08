package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButtonPress();
            }
        });

        button2 = (Button) findViewById(R.id.buttonReg);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegButtonPress();
            }
        });
    }

    public void LoginButtonPress(){
        Intent intent = new Intent(this, UserMainActivity.class);
        startActivity(intent);
    }

    public void RegButtonPress(){
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}