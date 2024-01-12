package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private EditText editTextName;
    private EditText editTextPassword;

    public String seeEditText;
    public String testText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.buttonLogin);
        button2 = (Button) findViewById(R.id.buttonReg);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButtonPress();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegButtonPress();
            }
        });
    }

    public void LoginButtonPress(){

        seeEditText = editTextName.getText().toString();
        //testText = editTextName.getText().toString();
        Log.d("Test1", seeEditText);

        if (editTextName.getText().toString().equals("aa")){
            Intent intent = new Intent(this, UserMainActivity.class);
            startActivity(intent);
        }
        else{
            Log.d("Test1", "fail");
        }
    }

    public void RegButtonPress(){
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}