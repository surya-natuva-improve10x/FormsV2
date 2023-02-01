package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("firstname");
        String lastName = intent.getStringExtra("lastname");
        String apartment = intent.getStringExtra("apartment");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state, Toast.LENGTH_SHORT).show();
        EditText birthTxt = findViewById(R.id.birth_txt);
        birthTxt.setText("13/02/2000");
        EditText placeTxt = findViewById(R.id.currentcompany_txt);
        placeTxt.setText("KOILKUNTLA");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String dateofBirth = birthTxt.getText().toString();
            String placeOfBirth = placeTxt.getText().toString();
            Intent professinalIntent = new Intent(this, ProfessinalActivity.class);
            professinalIntent.putExtra("email", email);
            professinalIntent.putExtra("username", userName);
            professinalIntent.putExtra("firstname", firstName);
            professinalIntent.putExtra("lastname", lastName);
            professinalIntent.putExtra("apartment", apartment);
            professinalIntent.putExtra("street", street);
            professinalIntent.putExtra("city", city);
            professinalIntent.putExtra("state", state);
            professinalIntent.putExtra("dateofbirth", dateofBirth);
            professinalIntent.putExtra("placeofbirth", placeOfBirth);
            startActivity(professinalIntent);
        });

    }
}