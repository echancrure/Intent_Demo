package com.example.myapplication.view;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fillUpClicked(View v) {
        Intent i = new Intent(this, FillUpActivity.class);
        startActivity(i);
    }

    public void logoutClicked(View v ) {
        viewUtils.displayUnimplementedToast(v);
    }

    public void optionsClicked(View v) {
        viewUtils.displayUnimplementedToast(v);
    }
 }
