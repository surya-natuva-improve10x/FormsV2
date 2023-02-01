package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("firstname");
        String lastName = intent.getStringExtra("lastname");
        String apartment = intent.getStringExtra("apartment");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String dateofbirth = intent.getStringExtra("dateofbirth");
        String placeofbirth = intent.getStringExtra("placeofbirth");
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state + dateofbirth + " " + placeofbirth, Toast.LENGTH_SHORT).show();

        EditText currentcompanyTxt = findViewById(R.id.currentcompany_txt);
        currentcompanyTxt.setText("Improve10X");
        EditText totalexperienceTxt = findViewById(R.id.totalexperience_txt);
        totalexperienceTxt.setText("2MONTHS");
        EditText designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText("Nothing");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String currentCompany = currentcompanyTxt.getText().toString();
            String totalExperience = totalexperienceTxt.getText().toString();
            String designation = designationTxt.getText().toString();
            Intent professinal = new Intent(this, BankActivity.class);
            professinal.putExtra("email", email);
            professinal.putExtra("username", userName);
            professinal.putExtra("firstname", firstName);
            professinal.putExtra("lastname", lastName);
            professinal.putExtra("apartment", apartment);
            professinal.putExtra("street", street);
            professinal.putExtra("city", city);
            professinal.putExtra("state", state);
            professinal.putExtra("dateofbirth", dateofbirth);
            professinal.putExtra("placeofbirth", placeofbirth);
            professinal.putExtra("currentcompany", currentCompany);
            professinal.putExtra(" totalexperience", totalExperience);
            professinal.putExtra("desgination", designation);
            startActivity(professinal);
        });
    }
}