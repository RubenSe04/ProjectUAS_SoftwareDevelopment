package com.example.mycoffeapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mycoffeapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    EditText name,email,password;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().hide();
        auth = FirebaseAuth.getInstance();

        name  = findViewById(R.id.inputUser);
        email = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);
    }

    public void Register(View view){

        String username = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();

        if (TextUtils.isEmpty(username)){
            Toast.makeText(this,"Enter Name", Toast.LENGTH_SHORT).show();
        }

        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(this,"Enter Email addresss", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(userPassword)){
            Toast.makeText(this,"Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (userPassword.length()<6){
            Toast.makeText(this, "Password too short, enter 6 character", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.createUserWithEmailAndPassword(userEmail,userPassword)
                .addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegistrationActivity.this,"Succesful Register",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                        }else {
                            Toast.makeText(RegistrationActivity.this,"Registration failed"+task.getException(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void Login(View view) {
      startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }


//    public void Register(View view) {
//        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
//    }

}