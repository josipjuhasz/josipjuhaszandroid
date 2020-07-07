package com.example.josipjuhaszandroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        setuprecycler();
        setuprecyclerdata();


    }

    private void setuprecyclerdata(){
        List<String> lista = new ArrayList<>();
        lista.add("Aatrox");
        lista.add("Amumu");
        lista.add("Ahri");
        lista.add("Akali");
        lista.add("Alistair");
        lista.add("Anivia");
        lista.add("Annie");
        lista.add("Brand");
        lista.add("Braum");
        lista.add("Blitzcrank");
        lista.add("Camille");
        lista.add("Caitlyn");
        lista.add("Cassiopeia");
        lista.add("Corki");
        lista.add("Cho'Gath");
        lista.add("Darius");
        lista.add("Diana");
        lista.add("Dr. Mundo");
        lista.add("Draven");
        lista.add("Ekko");
        lista.add("Elise");
        lista.add("Evelynn");
        lista.add("Ezreal");
        lista.add("Fiddlesticks");
        lista.add("Fiora");
        lista.add("Garen");
        lista.add("Gnar");
        lista.add("Gragas");
        lista.add("Hecarim");
        lista.add("Heimerdinger");
        lista.add("Illaoi");
        lista.add("Ivern");
        lista.add("Irelia");
        lista.add("Janna");
        lista.add("Jarvan IV");
        lista.add("Jax");
        lista.add("Jayce");
        lista.add("Kai'Sa");
        lista.add("Kalista");
        lista.add("LeBlanc");
        lista.add("Lux");
        lista.add("Malphite");
        recyclerAdapter.setData(lista);
    }

    private void setuprecycler(){
        this.recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);
    }
}
