package com.example.signin_signup_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnSignIn, btnSignUp_Activity;
    public EditText edtPass,edtUse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        controlButton();
    }

    private void  controlButton() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUse.getText().length() != 0 && edtPass.getText().length() != 0) {
                    if (edtUse.getText().toString().equals("aithi") && edtPass.getText().toString().equals("123")) {
                        Toast.makeText(MainActivity.this, "Ban da dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Profile.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Sai thong tin tai khoan hoac mat khau", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Moi ban nhap du thong tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSignUp_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void anhxa() {
        edtUse= (EditText) findViewById(R.id.txtEmail);
        edtPass= (EditText) findViewById(R.id.txtPassword);
        btnSignIn= (Button) findViewById(R.id.btnSignIn);
        btnSignUp_Activity = (Button) findViewById(R.id.btnSignUp_Activity);
    }
}