package com.example.josipjuhaszandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnClickAllChamps(View view){
        Intent GoToChamps = new Intent(this,Recycler.class);
        startActivity(GoToChamps);
    }

    public void OnClickMostPlayed(View view){
        Intent GoToMostPlayed = new Intent(this, FragmentClass.class);
        startActivity(GoToMostPlayed);

    }



}
