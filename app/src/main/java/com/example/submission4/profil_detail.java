package com.example.submission4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profil_detail extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_detail);

        // memberikan nilai untuk tombol kembali yang di desain
        ImageButton backTo = findViewById(R.id.ic_back);
        backTo.setOnClickListener(this);

    }
    // onclick pada activity lain dengan intent
    @Override
    public void onClick(View v) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
