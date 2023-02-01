package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
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
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state + " " + dateofbirth + " " + placeofbirth + " " + totalExperience + " " + desgination, Toast.LENGTH_SHORT).show();
        EditText bankTxt = findViewById(R.id.bankname_txt);
        bankTxt.setText("Paytm Payments Bank");
        EditText accountHolderNameTxt = findViewById(R.id.account_name_txt);
        accountHolderNameTxt.setText("Arjun Surya");
        EditText accountNumberTxt = findViewById(R.id.accountnumber_txt);
        accountNumberTxt.setText("9959973864");
        EditText ifscTxt = findViewById(R.id.ifsccode_id);
        ifscTxt.setText("PATYM12345678");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String bankName = bankTxt.getText().toString();
            String accountHolderName = accountHolderNameTxt.getText().toString();
            String accountNumber = accountNumberTxt.getText().toString();
            String ifscCode = ifscTxt.getText().toString();
            Intent bankIntent = new Intent(this, CreditActivity.class);
            bankIntent.putExtra("email", email);
            bankIntent.putExtra("username", userName);
            bankIntent.putExtra("firstname", firstName);
            bankIntent.putExtra("lastname", lastName);
            bankIntent.putExtra("apartment", apartment);
            bankIntent.putExtra("street", street);
            bankIntent.putExtra("city", city);
            bankIntent.putExtra("state", state);
            bankIntent.putExtra("dateofbirth", dateofbirth);
            bankIntent.putExtra("placeofbirth", placeofbirth);
            bankIntent.putExtra("currentcompany", currentCompany);
            bankIntent.putExtra(" totalexperience", totalExperience);
            bankIntent.putExtra("desgination", desgination);
            bankIntent.putExtra("bankname", bankName);
            bankIntent.putExtra("accountholdername", accountHolderName);
            bankIntent.putExtra("accountnumber", accountNumber);
            bankIntent.putExtra("ifsc", ifscCode);
            startActivity(bankIntent);
        });
    }
}