package com.example.mycoffeapp.activities;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mycoffeapp.MainActivity;
import com.example.mycoffeapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            getSupportActionBar().hide();

            auth = FirebaseAuth.getInstance();
            email  = findViewById(R.id.inputEmail);
            password = findViewById(R.id.inputPassword);
    }

    public void Login(View view){

        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();


        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(this,"Enter Email", Toast.LENGTH_SHORT).show();
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
        auth.signInWithEmailAndPassword(userEmail,userPassword)
                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LoginActivity.this,"Login Succes",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        }else {
                            Toast.makeText(LoginActivity.this,"Error"+task.getException(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
=======
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mycoffeapp.MainActivity;
import com.example.mycoffeapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
    }

    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

<<<<<<< HEAD
//    public void MainActivity(View view) {
//        startActivity(new Intent(LoginActivity.this, MainActivity.class));
//    }
=======
    public void MainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
}