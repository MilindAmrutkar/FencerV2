package com.spottechnician.fencerv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HOTOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoto);

    }

    public void AssignModifyHOTO(View view) {

    }

    public void addNewSite(View view) {
        Intent intent = new Intent(getApplicationContext(), AddNewSiteActivity.class);
        startActivity(intent);
    }
}
