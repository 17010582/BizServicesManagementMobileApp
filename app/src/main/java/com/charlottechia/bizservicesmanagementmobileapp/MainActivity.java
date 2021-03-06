package com.charlottechia.bizservicesmanagementmobileapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUsername,etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);




        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = etPassword.getEditableText().toString();
                String username = etUsername.getEditableText().toString();

                if ((username.equalsIgnoreCase("1")) && (password.equalsIgnoreCase("password"))) {

                    openAdminHomePage();
                } else if ((username.equalsIgnoreCase("169799978")) && (password.equalsIgnoreCase("password"))) {

                    openUserHomePage();
                } else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getApplicationContext());

                }
            }
        });

    }
    public void openAdminHomePage () {
        Intent intent  = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(intent);
    }
    public void openUserHomePage () {
        Intent intent2  = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(intent2);
    }
}
