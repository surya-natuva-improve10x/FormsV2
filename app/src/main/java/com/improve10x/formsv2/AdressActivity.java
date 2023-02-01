package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("firstname");
        String lastName = intent.getStringExtra("lastname");
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName, Toast.LENGTH_SHORT).show();
        EditText apartmentTxt = findViewById(R.id.apratement_txt);
        apartmentTxt.setText("Own house");
        EditText streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText("RtcbustandRoad");
        EditText cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText("Koilkuntla");
        EditText stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText("Andhra Pradesh");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String apartment = apartmentTxt.getText().toString();
            String street = streetTxt.getText().toString();
            String city = cityTxt.getText().toString();
            String state = stateTxt.getText().toString();
            Intent birthIntent = new Intent(this, BirthActivity.class);
            birthIntent.putExtra("email", email);
            birthIntent.putExtra("username", userName);
            birthIntent.putExtra("firstname", firstName);
            birthIntent.putExtra("lastname", lastName);
            birthIntent.putExtra("apartment", apartment);
            birthIntent.putExtra("street", street);
            birthIntent.putExtra("city", city);
            birthIntent.putExtra("state", state);
            startActivity(birthIntent);
        });

    }
}