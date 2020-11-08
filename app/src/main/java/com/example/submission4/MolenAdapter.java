package com.example.submission4;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.ArrayList;

import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import static android.media.CamcorderProfile.get;


public class MolenAdapter extends RecyclerView.Adapter<MolenAdapter.MolenViewHolder> {

    private ArrayList<molen> listMolen;
    private Context context;
    public MolenAdapter(ArrayList<molen> list) {
        this.listMolen = list;

    }


    @NonNull
    @Override
    public MolenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
       return new MolenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MolenViewHolder holder, final int position) {
        final molen Molen = listMolen.get(position);
        Glide.with(holder.itemView.getContext()).load(Molen.getPhoto())
                .apply(new RequestOptions().override(65, 65))
                .into(holder.imgPhoto);
        holder.NamaMolen.setText(Molen.getName());
        holder.HargaMolen.setText(Molen.getPrice());
        //holder.DetailMolen.setText(Molen.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.MOLEN_EXTRA, listMolen.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMolen.size();
    }



    class MolenViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView NamaMolen;
        TextView HargaMolen;
        TextView DetailMolen;
        RelativeLayout MenuList;


        public MolenViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto =itemView.findViewById(R.id.item_photo);
            NamaMolen = itemView.findViewById(R.id.item_name);
            HargaMolen = itemView.findViewById(R.id.item_price);
            MenuList = itemView.findViewById(R.id.menu_list);

        }

    }
}
