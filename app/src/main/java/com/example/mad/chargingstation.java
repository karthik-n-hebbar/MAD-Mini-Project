package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class chargingstation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chargingstation);

        Button button = findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chargingstation.this, evs.class);
                startActivity(intent);
            }
        });

        TextView txt = findViewById(R.id.address1);
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "Laven Gardenia";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
                else
                {
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt2 = findViewById(R.id.address2);
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "DSATM";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
                else
                {
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt3 = findViewById(R.id.address3);
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "DSU";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
                else
                {
                    startActivity(mapIntent);
                }
            }
        });

        TextView txt4 = findViewById(R.id.address4);
        txt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String location = "DSI";  // Replace with the desired location

                // Create an Intent with the location data
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");  // Specify the package name of the maps application

                // Check if there is a maps application available to handle the intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the maps application
                    startActivity(mapIntent);
                }
                else
                {
                    startActivity(mapIntent);
                }
            }
        });

        // Define an array of contact TextView IDs
        int[] contactTextViewIds = {R.id.contact1, R.id.contact2, R.id.contact3, R.id.contact4};

        // Iterate through the contact TextViews
        for (int i = 0; i < contactTextViewIds.length; i++) {
            TextView contactTextView = findViewById(contactTextViewIds[i]);
            contactTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phoneNumber = contactTextView.getText().toString().trim();

                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:" + phoneNumber));

                    if (callIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(callIntent);
                    }
                    else
                    {
                        startActivity(callIntent);
                    }
                }
            });
        }

    }
}
