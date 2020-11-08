package com.example.submission4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class cardViewAdapter extends RecyclerView.Adapter<cardViewAdapter.CardViewHolder> {

    private Context context;
    private ArrayList<molen> listMolen;
    public cardViewAdapter(ArrayList<molen> list){
        this.listMolen = list;
    }

    @NonNull
    @Override
    public cardViewAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final cardViewAdapter.CardViewHolder holder, final int position) {
        molen Molen = listMolen.get(position);

        Glide.with(holder.itemView.getContext())
                .load(Molen.getPhoto())
                .apply(new RequestOptions().override(320,150))
                .into(holder.tvCardimg);

        holder.tvPrice.setText(Molen.getPrice());

        holder.tvCardimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Molen " + listMolen.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.MOLEN_EXTRA, listMolen.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMolen.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView tvCardimg;
        TextView tvPrice;
        Button btnDetail;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            tvCardimg = itemView.findViewById(R.id.tv_card_img);
            tvPrice = itemView.findViewById(R.id.tv_text_price);
            btnDetail = itemView.findViewById(R.id.toDetail);
        }
    }
}
