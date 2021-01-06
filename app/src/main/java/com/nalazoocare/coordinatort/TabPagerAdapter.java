package com.nalazoocare.coordinatort;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-04-17
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;


    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
//clone test
        switch (position) {
            case 0:
                TabFragment1 fragment1 = new TabFragment1();
                return fragment1;
            case 1:
                TabFragment2 fragment2 = new TabFragment2();
                return fragment2;

            case 2:
                TabFragment3 fragment3 = new TabFragment3();
                return fragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
