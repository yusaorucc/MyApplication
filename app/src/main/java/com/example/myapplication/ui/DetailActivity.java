package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.BikeStation;
import com.example.myapplication.R;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView tvDetayText,tvDetayText2,tvDetayTtle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvDetayText = findViewById(R.id.tvDetayText);
        tvDetayText2 = findViewById(R.id.tvDetayText2);
        tvDetayTtle = findViewById(R.id.tvDetayTtle);

        BikeStation model = (BikeStation) getIntent().getExtras().getSerializable("model");
        tvDetayText.setText(model.getStationName());
        tvDetayText2.setText ("Full Slot: " + model.getFullSlot());
        tvDetayTtle.setText ("Empty Slot: " + model.getEmptySlot());

    }
}