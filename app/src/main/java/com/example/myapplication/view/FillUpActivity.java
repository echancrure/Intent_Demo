package com.example.myapplication.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

import logic.PetrolTracker;

public class FillUpActivity extends AppCompatActivity {
    private EditText priceText;
    private EditText amountText;
    private EditText odometerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_up);
        priceText = findViewById(R.id.price);
        amountText = findViewById(R.id.amount);
        odometerText = findViewById(R.id.odometer);
    }

    public void submitClicked(View v) {
        float price;
        float amount;
        int odometer;
        price = Float.parseFloat(this.priceText.getText().toString());
        amount = Float.parseFloat(this.amountText.getText().toString());
        odometer = Integer.parseInt(this.odometerText.getText().toString());
        PetrolTracker.getInstance().submitFillUp(price, amount, odometer);
        this.finish();
    }

}
