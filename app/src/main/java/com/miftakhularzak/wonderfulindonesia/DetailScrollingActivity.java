package com.miftakhularzak.wonderfulindonesia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailScrollingActivity extends AppCompatActivity {

    ArrayList<WisataModel>listData = new ArrayList<>();
    private ImageView ivDetailGambar;
    private TextView tvDetailDeskripsi;
    private TextView tvDetailLokasi;
    private TextView tvDetailNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        initView();

       Bundle dataWisata = getIntent().getExtras();
        String namaWisata = dataWisata.getString(Konstanta.DATA_NAMA);
        String lokasiWisata = dataWisata.getString(Konstanta.DATA_LOKASI);
        String deskripsiWisata = dataWisata.getString(Konstanta.DATA_DESKRIPSI);
        String gambarWisata = dataWisata.getString(Konstanta.DATA_GAMBAR);

        getSupportActionBar().setTitle(namaWisata);
        tvDetailDeskripsi.setText(deskripsiWisata);
        tvDetailLokasi.setText(lokasiWisata);
        Glide.with(this).load(gambarWisata)
                .placeholder(R.drawable.ic_action_noimage)
                .error(R.drawable.ic_action_noimage)
              .into(ivDetailGambar);

    }

    private void initView(){
        ivDetailGambar = (ImageView)findViewById(R.id.iv_detail_gambar);
        tvDetailDeskripsi = (TextView)findViewById(R.id.tv_detail_deskripsi);
        tvDetailLokasi = (TextView)findViewById(R.id.tv_detail_lokasi);

    }
}
