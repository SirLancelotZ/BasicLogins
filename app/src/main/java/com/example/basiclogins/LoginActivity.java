package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private TextView createAccount;


    public static final String EXTRA_SENT_MESSAGE = "the message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        wireWidgets();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();

                String pass = password.getText().toString();
                //Intent intentLogin = new Intent(LoginActivity.this, CreateAccountActivity.class);

                //intentLogin.putExtra(EXTRA_SENT_MESSAGE, user);

                //startActivity(intentLogin);

            }
        });
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an intent with no arguments
                Intent intentCreateAccount = new Intent(LoginActivity.this, CreateAccountActivity.class);
                intentCreateAccount.setType("text/plain");
                intentCreateAccount.putExtra(EXTRA_SENT_MESSAGE, username.getText().toString());
                startActivity(intentCreateAccount);
            }
        });


    }

    private void wireWidgets() {
        username = findViewById(R.id.editText_login_username);
        password = findViewById(R.id.editText_login_password);
        login = findViewById(R.id.button_login_login);
        createAccount = findViewById(R.id.textView_login_CreateAccount);
    }
}
