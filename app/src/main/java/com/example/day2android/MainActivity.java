package com.example.day2android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Password;
    Button Login;
    Button Signup;
    TextView info;
    int counter = 5;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.EnterEmail);
        Password = (EditText) findViewById(R.id.EnterPassword);
        Login = (Button) findViewById(R.id.Login);
        Signup = (Button)findViewById((R.id.Signup));
        

    }
}

        /*@Override
        public void onClick(View view) {
            validate(Name.getText().toString(),Password.getText().toString());
        }
    /);
}
    void validate(String username,String password){
        if(username.isEmpty()||username.trim().length()==0){
            Name.setError("Enter Email id");
            return;
        }
        if(username.equals("abhishek")&&password.equals("1234")){
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);

            startActivity(intent);
            finish();
        }
    }
} */

