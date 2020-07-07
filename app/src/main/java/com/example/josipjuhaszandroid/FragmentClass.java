package com.example.josipjuhaszandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class FragmentClass extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments);


        initViews();
        setuppager();
    }

    private void initViews(){
        viewPager = findViewById(R.id.ViewPager);
        tabLayout = findViewById(R.id.tab);
    }

    private void setuppager(){
        PagerAdapter pagerAdapter = new SlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void OnClickLeeSinRunes(View view){
        Intent GoToChamps = new Intent(this,leesinrunes.class);
        startActivity(GoToChamps);
    }
    public void OnClickLeeSinBuild(View view){
        Intent GoToChamps = new Intent(this,leesinbuild.class);
        startActivity(GoToChamps);
    }
    public void OnClickAmumuRunes(View view){
        Intent GoToChamps = new Intent(this,amumurunes.class);
        startActivity(GoToChamps);
    }
    public void OnClickHome(View view){
        Intent GoToChamps = new Intent(this,MainActivity.class);
        startActivity(GoToChamps);
    }
    public void OnClickAmumuBuild(View view){
        Intent GoToChamps = new Intent(this,amumubuild.class);
        startActivity(GoToChamps);
    }
    public void OnClickPantheonRunes(View view){
        Intent GoToChamps = new Intent(this,pantheonrunes.class);
        startActivity(GoToChamps);
    }
    public void OnClickPantheonBuild(View view){
        Intent GoToChamps = new Intent(this,pantheonbuild.class);
        startActivity(GoToChamps);
    }
    public void OnClickNamiRunes(View view){
        Intent GoToChamps = new Intent(this,namirunes.class);
        startActivity(GoToChamps);
    }
    public void OnClickNamiBuild(View view){
        Intent GoToChamps = new Intent(this,namibuild.class);
        startActivity(GoToChamps);
    }
    public void OnClickNamiH(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=wd_Sz59QTVk");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void OnClickLeeH(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=e6SleHuJjLo");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void OnClickAmumuH(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=dceS7yaTV5g");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void OnClickPantheonH(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=jjFZ2pF-LoM");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



    public void OnClickDisplayToastAmumu(View view) {
        Toast.makeText(this,"Amumu",Toast.LENGTH_SHORT).show();
    }

    public void OnClickDisplayToastLee(View view) {
        Toast.makeText(this,"Lee Sin",Toast.LENGTH_SHORT).show();
    }

    public void OnClickDisplayToastPantheon(View view) {
        Toast.makeText(this,"Pantheon",Toast.LENGTH_SHORT).show();
    }

    public void OnClickDisplayToastNami(View view) {
        Toast.makeText(this,"Nami",Toast.LENGTH_SHORT).show();
    }

}
