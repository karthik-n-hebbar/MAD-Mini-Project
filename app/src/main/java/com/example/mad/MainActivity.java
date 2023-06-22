package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void ev2(View view){setContentView(R.layout.batteryswap);}
    public void ev3(View view){setContentView(R.layout.garage);}
    public void ev4(View view){setContentView(R.layout.towtruck);}



    public void icPPButton(View view){
        setContentView(R.layout.petrolpump);
    }
    public void ic2(View view){setContentView(R.layout.servicestation);}
    public void ic3(View view){setContentView(R.layout.mobilepp);}
    public void ic4(View view){setContentView(R.layout.tt);}


    public void cslayoutButton(View view){
        setContentView(R.layout.evs);
    }
    public void pplayoutButton(View view){
        setContentView(R.layout.ice);
    }


}