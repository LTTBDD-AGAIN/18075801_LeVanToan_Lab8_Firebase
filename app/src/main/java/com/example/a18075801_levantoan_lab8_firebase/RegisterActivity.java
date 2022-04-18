
package com.example.a18075801_levantoan_lab8_firebase;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private TextView mTvYourName, mTvEmail, mTvPassword, mTvRePassword;
    private Button mBtnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        mTvYourName = findViewById(R.id.tvYourName);
        mTvEmail = findViewById(R.id.tvEmail);
        mTvPassword = findViewById(R.id.tvPassword);
        mTvRePassword = findViewById(R.id.tvRePassword);
        mBtnRegister = findViewById(R.id.btnRegister);

        mAuth = FirebaseAuth.getInstance();

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mTvEmail.getText().toString();
                String password = mTvPassword.getText().toString();
//                mAuth.createUserWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if(task.isSuccessful()){
//                                    //Sign in success
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                }else{
//                                    Toast.makeText(RegisterActivity.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        });
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Toast.makeText(RegisterActivity.this, "Da ton tai", Toast.LENGTH_SHORT).show();
        }
    }


}
