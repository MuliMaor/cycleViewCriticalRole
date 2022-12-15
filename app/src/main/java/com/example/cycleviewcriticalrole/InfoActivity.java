package com.example.cycleviewcriticalrole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        int imageID = getIntent().getIntExtra("clickedBigImageID", 0);
        String characterInfo = getIntent().getStringExtra("clickedInfo");

        ImageView infoImageView = findViewById(R.id.infoImageView);
        TextView infoTextView = findViewById(R.id.infoTextView);

        infoImageView.setImageResource(imageID);
        infoTextView.setText(characterInfo);
    }
}