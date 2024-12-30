package com.example.taxcalculator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double income = 45000; // Example income
        double tax = calculateTax(income);

        TextView resultView = findViewById(R.id.resultView);
        resultView.setText("Income: " + income + "\nTax: " + tax);
    }

    private double calculateTax(double income) {
        if (income < 10000) {
            return 0;
        } else if (income <= 30000) {
            return 0.15 * (income - 10000);
        } else {
            return 3000 + 0.15 * (income - 30000);
        }
    }
}
