package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup);
        EditText emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText("natuvasurya3261@rediffmail.com");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String emailAddress = emailTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.passwotd_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmTxt = findViewById(R.id.confirmpassword_txt);
            String confirmPassword = confirmTxt.getText().toString();
            Intent intent = new Intent(this, PersonalActivity.class);
            intent.putExtra("email", emailAddress);
            startActivity(intent);
        });

    }
}