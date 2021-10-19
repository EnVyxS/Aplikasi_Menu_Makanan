package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;

    GridLayoutManager gridLayoutManager;

    DashBoardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        addData();
        gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new DashBoardAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new SetterGetter("Sate","FotoMakanan1","Rp.21.000","Sate Ayam Dengan Bumbu Kacang","Harga:   Rp.21.000",R.drawable.sate));
        datamenu.add(new SetterGetter("Bakso","FotoMakanan2","Rp.13.000","Bakso Urat Sapi","Harga:   Rp.13.000",R.drawable.bakso));
        datamenu.add(new SetterGetter("Tahu","FotoMakanan3","Rp.3.000","Tahu Asin","Harga   Rp.3.000",R.drawable.tahu));
        datamenu.add(new SetterGetter("Nasi+Ayam","FotoMakanan4","Rp.15.000","Nasi + Ayam Dengan Lalapan dan Sambal","Harga:   Rp.15.000",R.drawable.nasi_ayam));
        datamenu.add(new SetterGetter("Pecel Lele","FotoMakanan5","Rp.17.000","Nasi, Lele, Lalapan, Sambal","Harga:   Rp.17.000",R.drawable.pecel_lele));
    }
}