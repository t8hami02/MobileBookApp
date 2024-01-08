package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserBooksActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_books);

        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackButtonPress();
            }
        });

        button2 = (Button) findViewById(R.id.buttonBook);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BookButtonPress();
            }
        });
    }

    public void BackButtonPress(){
        Intent intent = new Intent(this, UserMainActivity.class);
        startActivity(intent);
    }

    public void BookButtonPress(){
        Intent intent = new Intent(this, ReadActivity.class);
        startActivity(intent);
    }
}