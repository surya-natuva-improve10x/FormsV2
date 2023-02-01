package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
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
        Toast.makeText(this, email + " " + userName + " " + firstName + " " + lastName + " " + apartment + " " + street + " " + city + " " + state +" " + dateofbirth + " " + placeofbirth + " " + totalExperience + " " + desgination + accountnumber + bankname + accountholdername + ifsc + creditnumber + cardholder + expirydate + cvv, Toast.LENGTH_SHORT).show();

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText panTxt = findViewById(R.id.pannumber_txt);
            panTxt.setText("Dppps132566");
            EditText aadhaarTxt = findViewById(R.id.aadhaar1_txt);
            aadhaarTxt.setText("480575276378");
            String panNo = panTxt.getText().toString();
            String aadhaarNo = aadhaarTxt.getText().toString();
        Intent sucessIntent = new Intent(this,RegistrationSuccessfullActivity.class);
        sucessIntent.putExtra("email",email);
        sucessIntent.putExtra("username",userName);
        sucessIntent.putExtra("firstname",firstName);
        sucessIntent.putExtra("lastname",lastName);
        sucessIntent.putExtra("apartment",apartment);
        sucessIntent.putExtra("street",street);
        sucessIntent.putExtra("city",city);
        sucessIntent.putExtra("state",state);
        sucessIntent.putExtra("dateofbirth" ,dateofbirth);
        sucessIntent.putExtra("placeofbirth",placeofbirth);
        sucessIntent.putExtra("currentcompany", currentCompany);
        sucessIntent.putExtra(" totalexperience",totalExperience);
        sucessIntent.putExtra("desgination",desgination);
        sucessIntent.putExtra("bankname",bankname);
        sucessIntent.putExtra("accountholdername",accountholdername);
        sucessIntent.putExtra("accountnumber",accountnumber);
        sucessIntent.putExtra("ifsc",ifsc);
        sucessIntent.putExtra("creditCardNumber" ,creditnumber);
        sucessIntent.putExtra("cardholder",cardholder);
        sucessIntent.putExtra("expirty",expirydate);
        sucessIntent.putExtra("cvv",cvv);
        sucessIntent.putExtra("panNo",panNo);
        sucessIntent.putExtra("aadhaarNo",aadhaarNo);
        startActivity(sucessIntent);
        });
    }
}
