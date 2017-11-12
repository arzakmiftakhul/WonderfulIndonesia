package com.miftakhularzak.wonderfulindonesia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Miftakhul Arzak on 05/11/2017.
 */

public class Wisata extends RecyclerView.Adapter<Wisata.MyViewHolder> {
    private Context context;
    private ArrayList<WisataModel>listData;

    //generate constructor
    public Wisata(Context context, ArrayList<WisataModel>listData){
        this.context = context;
        this.listData = listData;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tvItemNama.setText(listData.get(position).getNama());
        Glide.with(context).load(listData.get(position).getGambar()).into(holder.ivItemGambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent pindah = new Intent(context,DetailScrollingActivity.class);
                Toast.makeText(context, listData.get(position).getNama().toString(), Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(context,DetailScrollingActivity.class);
                Bundle dataWisata = new Bundle();
                dataWisata.putString(Konstanta.DATA_NAMA,listData.get(position).getNama());
                dataWisata.putString(Konstanta.DATA_LOKASI,listData.get(position).getLokasi());
                dataWisata.putString(Konstanta.DATA_DESKRIPSI,listData.get(position).getDeskripsi());
                dataWisata.putString(Konstanta.DATA_GAMBAR,listData.get(position).getGambar());
                pindah.putExtras(dataWisata);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        //menyambungkan komponen yang ada di item list
       ImageView ivItemGambar;
        TextView tvItemNama;
        TextView tvItemLokasi;
        public MyViewHolder(View itemView) {
            super(itemView);
            ivItemGambar = (ImageView)itemView.findViewById(R.id.gambarWisata);
            tvItemNama = (TextView)itemView.findViewById(R.id.namaWisata);
        }
    }
}
