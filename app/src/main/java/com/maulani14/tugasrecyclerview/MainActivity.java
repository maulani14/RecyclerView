package com.maulani14.tugasrecyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new RecyclerViewAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Choirunnisa Maulani", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Rahajeng Amelia Putri", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ulfatunnisa", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Futihatun Khusnia", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Garnis Kartiko Sari", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Cindy Viona Hertanti", "1214378098", "098758124"));
    }
}