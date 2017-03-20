package com.spottechnician.fencerv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

    }

    public void HOTOActivity(View view) {
        //Intent intent = new Intent(getApplicationContext(), HandoverActivity.class);
        Intent intent = new Intent(getApplicationContext(), TakeoverActivity2.class);
        //Intent intent = new Intent(getApplicationContext(), HOTOActivity.class);
        startActivity(intent);
    }

    public void openCTHKActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), CTHKActivity.class);
        startActivity(intent);
    }
}
