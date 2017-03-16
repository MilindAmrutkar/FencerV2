package com.spottechnician.fencerv2;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private SQLiteDatabase database;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dbHelper = new DBHelper(this);
        open();


    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void Services(View view) {
        Intent intent = new Intent(HomeActivity.this, ServicesActivity.class);
        startActivity(intent);
    }
}
