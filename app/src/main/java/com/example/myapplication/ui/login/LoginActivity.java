package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.ui.MainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnGrs = findViewById(R.id.btnGrs);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etLgn = findViewById(R.id.etLgn);

        btnGrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etLgn.getText().toString().contains("admin") && etPassword.getText().toString().contains("1234")){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
                else if(etLgn.getText().toString().contains("yusa") && etPassword.getText().toString().contains("1234")){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });

    }
}