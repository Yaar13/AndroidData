package com.example.day2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Password;
    Button Login;
    TextView info;
    View info;
    int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.EnterEmail);
        Password = (EditText)findViewById(R.id.EnterPassword);
        Login = (EditText)findViewById(R.id.Login);
        info





    }
}
