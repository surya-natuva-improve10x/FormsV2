package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
        EditText usernameTxt = findViewById(R.id.username_txt);
        usernameTxt.setText("surya");
        EditText firstnameTxt = findViewById(R.id.firstname_txt);
        firstnameTxt.setText("natuva");
        EditText lastnameTxt = findViewById(R.id.lastname_txt);
        lastnameTxt.setText("Suriya");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String userName = usernameTxt.getText().toString();
            String firstName = firstnameTxt.getText().toString();
            String lastName = lastnameTxt.getText().toString();
            Intent adressIntent = new Intent(this,AdressActivity.class);
            adressIntent.putExtra("email", email);
            adressIntent.putExtra("username", userName);
            adressIntent.putExtra("firstname", firstName);
            adressIntent.putExtra("lastname", lastName);
            startActivity(adressIntent);

        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
          finish();

        });

    }
}