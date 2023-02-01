package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationSuccessfullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successfull);
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
        String currentCompany = intent.getStringExtra("currentcompany");
        String totalExperience = intent.getStringExtra(" totalexperience");
        String desgination = intent.getStringExtra("desgination");
        String accountnumber = intent.getStringExtra("accountnumber");
        String bankname = intent.getStringExtra("bankname");
        String accountholdername = intent.getStringExtra("accountholdername");
        String ifsc = intent.getStringExtra("ifsc");
        String creditnumber = intent.getStringExtra("creditCardNumber");
        String cardholder = intent.getStringExtra("cardholder");
        String expirydate = intent.getStringExtra("expirty");
        String cvv = intent.getStringExtra("cvv");
        String panNo = intent.getStringExtra("panNo");
        String aadhaarNo = intent.getStringExtra("aadhaarNo");
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state +" " + dateofbirth + " " + placeofbirth + " " + totalExperience + " " + desgination + accountnumber + bankname + accountholdername + ifsc + creditnumber + cardholder + expirydate + cvv + panNo + aadhaarNo + currentCompany, Toast.LENGTH_SHORT).show();
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.firstname_txt);
        userNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.lastname_txt);
        userNameTxt.setText(lastName);
        TextView

    }
}