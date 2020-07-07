package com.example.josipjuhaszandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;



public class SlideAdapter extends FragmentStatePagerAdapter {

    private amumu flag1;
    private leesin flag2;
    private pantheon flag3;
    private nami flag4;
    private String polje[]={"Amumu","Lee Sin","Pantheon", "Nami"};
    private static final String BASE_NAME = "Tab #%d";
    private static final int NUM_PAGES=4;

    public SlideAdapter(@NonNull FragmentManager fm) {
        super(fm);
        flag1 = new amumu();
        flag2 = new leesin();
        flag3 = new pantheon();
        flag4 = new nami();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return flag1;
            case 1:
                return flag2;
            case 2:
                return flag3;
            default:
                return flag4;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return polje[position];
    }

}
