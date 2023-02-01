package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditcard);
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
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state + " " + dateofbirth + " " + placeofbirth + " " + totalExperience + " " + desgination + accountnumber + bankname + accountholdername + ifsc, Toast.LENGTH_SHORT).show();
        EditText creditnumberTxt = findViewById(R.id.creditnumber_txt);
        creditnumberTxt.setText("9999999999999");
        EditText cardholderTxt = findViewById(R.id.cardholder_txt);
        cardholderTxt.setText("arjun surya");
        EditText expiryTxt = findViewById(R.id.expirydate_txt);
        expiryTxt.setText("10/26");
        EditText cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText("666");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String creditCardNumber = creditnumberTxt.getText().toString();
            String cardHolder = cardholderTxt.getText().toString();
            String expiry = expiryTxt.getText().toString();
            String cvv = cvvTxt.getText().toString();
            Intent creditIntent = new Intent(this,IdentityActivity.class);
            creditIntent.putExtra("email",email);
            creditIntent.putExtra("username",userName);
            creditIntent.putExtra("firstname",firstName);
            creditIntent.putExtra("lastname",lastName);
            creditIntent.putExtra("apartment",apartment);
            creditIntent.putExtra("street",street);
            creditIntent.putExtra("city",city);
            creditIntent.putExtra("state",state);
            creditIntent.putExtra("dateofbirth" ,dateofbirth);
            creditIntent.putExtra("placeofbirth",placeofbirth);
            creditIntent.putExtra("currentcompany", currentCompany);
            creditIntent.putExtra(" totalexperience",totalExperience);
            creditIntent.putExtra("desgination",desgination);
            creditIntent.putExtra("bankname",bankname);
            creditIntent.putExtra("accountholdername",accountholdername);
            creditIntent.putExtra("accountnumber",accountnumber);
            creditIntent.putExtra("ifsc",ifsc);
            creditIntent.putExtra("creditCardNumber" ,creditCardNumber);
            creditIntent.putExtra("cardholder",cardHolder);
            creditIntent.putExtra("expirty",expiry);
            creditIntent.putExtra("cvv",cvv);
            startActivity(creditIntent);
        });
    }
}