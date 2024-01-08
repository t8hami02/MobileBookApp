package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserMainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

        button = (Button) findViewById(R.id.buttonLogout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogoutButtonPress();
            }
        });

        button2 = (Button) findViewById(R.id.buttonBooks);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BooksButtonPress();
            }
        });
    }

    public void LogoutButtonPress(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void BooksButtonPress(){
        Intent intent = new Intent(this, UserBooksActivity.class);
        startActivity(intent);
    }
}