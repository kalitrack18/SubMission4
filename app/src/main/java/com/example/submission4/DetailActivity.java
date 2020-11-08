package com.example.submission4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String MOLEN_EXTRA = "molen_extra";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        

        TextView name = findViewById(R.id.tv_item_name);

        TextView Price = findViewById(R.id.tv_price);

        TextView Detail = findViewById(R.id.tv_text_detail);
       // Detail.setMovementMethod(new ScrollingMovementMethod());

        ImageView image = findViewById(R.id.tv_item_img);

        molen bakulan = getIntent().getParcelableExtra(MOLEN_EXTRA);

        Glide.with(this).load(bakulan.getPhoto()).into(image);
        name.setText(bakulan.getName());
        Price.setText(bakulan.getPrice());
        Detail.setText(bakulan.getDetail());


        ImageView Order = findViewById(R.id.btn_order);
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Number = "6282282539799";

                Uri uri = Uri.parse("smsto: " + "6282282539799");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_TEXT, "Halo saya ingin memesan : ...\n");
                intent.putExtra("jid", Number +"@s.whatsapp.net" );
                intent.setPackage("com.whatsapp");
                startActivity(intent);

            }
        });

        ImageView btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);

    }

    private void setActionBar(String profil) {
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(profil);
        }
    }

    @Override
    public void onClick(View v) {
        Intent btnHome = new Intent(this, MainActivity.class);
        startActivity(btnHome);
    }
}
