package com.example.submission4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelperDetail extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_detail);

        Button btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent backTMnu = new Intent(this, MainActivity.class);
        startActivity(backTMnu);
    }
}
