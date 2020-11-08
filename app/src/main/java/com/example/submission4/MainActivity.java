package com.example.submission4;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

    Context context;
    private RecyclerView molenList;
    private ArrayList<molen> list = new ArrayList<>();
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        molenList = findViewById(R.id.molen_menu);
        molenList.setHasFixedSize(true);

        list.addAll(MolenListData.getListData());
        showMolenList();
    }

    private void showMolenList(){
        molenList.setLayoutManager(new LinearLayoutManager(context));
        MolenAdapter molenAdapter = new MolenAdapter(list);
        molenList.setAdapter(molenAdapter);
    }

    private void showRecyclerCardView(){
        molenList.setLayoutManager(new LinearLayoutManager(this));
        cardViewAdapter CardViewAdapter = new cardViewAdapter(list);
        molenList.setAdapter(CardViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int select){
        switch (select){
            case R.id.profil_id :
                title = "Profil";
                Intent intent = new Intent(this, profil_detail.class);
                startActivity(intent);
                break;
            case R.id.cardview :
                title = "Raja Molen Shop";
                showRecyclerCardView();
                break;
            case R.id.listview :
                title = "Raja Molen Shop";
                showMolenList();
                break;
            case R.id.helper :
                title = "Bantuan";
                Intent helper = new Intent(this, HelperDetail.class);
                startActivity(helper);
        }
        setActionBarTitle(title);
    }
}
