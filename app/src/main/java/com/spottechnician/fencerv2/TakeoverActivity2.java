package com.spottechnician.fencerv2;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class TakeoverActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeover2);

        ////////////////////////////////Will contains Fragments/////////////////////////////////

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.add(R.id.placeholder, new RNMFragment());
        //ft.add(R.id.placeholder, new EBillFragment());
        //ft.add(R.id.placeholder, new FLMFragment());
        ft.commit();
    }





}
