package com.lamtrang.dulichapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent gotoHome = new Intent(getApplicationContext(),QuickStartActivity.class);
        startActivity(gotoHome);
    }
}