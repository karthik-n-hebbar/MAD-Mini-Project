package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.button6);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exit the app
                finish();
                System.exit(0);
            }
        });
    }


    public void homelayoutButton(View view){setContentView(R.layout.evs);}
    public void homelayoutButton1(View view){
        setContentView(R.layout.ice);
    }


    public void evlayoutButton(View view){setContentView(R.layout.activity_main);}
    public void iclayoutButton(View view){setContentView(R.layout.activity_main);}



    public void evCSButton(View view){
        setContentView(R.layout.chargingstation);
    }
    public void ev2(View view){
        setContentView(R.layout.batteryswap);
    }
    public void ev3(View view){
        setContentView(R.layout.servicestation);
    }
    public void ev4(View view){
        setContentView(R.layout.towtruck);
    }



    public void icPPButton(View view){
        setContentView(R.layout.petrolpump);
    }
    public void ic2(View view){
        setContentView(R.layout.garage);
    }
    public void ic3(View view){
        setContentView(R.layout.mobilepp);
    }
    public void ic4(View view){
        setContentView(R.layout.tt);
    }


    public void cslayoutButton(View view){
        setContentView(R.layout.evs);
    }
    public void pplayoutButton(View view){
        setContentView(R.layout.ice);
    }


//    String location = "latitude,longitude"; // Replace with the desired location coordinates
//
//    // Create a Uri with the location details
//    Uri gmmIntentUri = Uri.parse("geo:" + location + "?z=15");
//
//    // Create an Intent with the Uri to launch Google Maps
//    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//    mapIntent.setPackage("com.google.android.apps.maps");
//
//    // Verify if there is an app available to handle the Intent
//    if (mapIntent.resolveActivity(getPackageManager()) != null) {
//            // Launch the Intent to open Google Maps
//            startActivity(mapIntent);
//    }

//    TextView myTextView = findViewById(R.id.contact);
//    String phoneNumber = myTextView.getText().toString();
//
//    // Create an Intent with the ACTION_DIAL action and the phone number
//    Intent intent = new Intent(Intent.ACTION_DIAL);
//    intent.setData(Uri.parse("tel:" + phoneNumber));

//    // Verify if there is an app available to handle the Intent
//    if (intent.resolveActivity(getPackageManager()) != null) {
//            // Launch the Intent to make the phone call
//            startActivity(intent);
//    }




}