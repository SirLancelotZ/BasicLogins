package com.example.basiclogins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private Button Create;
    private EditText name;
    private EditText username;
    private EditText password;
    private EditText password2;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        wireWidgets();


    }

    private void wireWidgets() {
        Create = findViewById(R.id.button_createAccount_create);
    }
}
