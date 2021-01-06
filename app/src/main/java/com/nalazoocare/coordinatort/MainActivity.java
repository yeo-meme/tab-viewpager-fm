package com.nalazoocare.coordinatort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import static com.nalazoocare.coordinatort.R.drawable.smile;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private ImageView c;
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTabLayout = findViewById(R.id.layout_tab);
        b = findViewById(R.id.btn);
        c = findViewById(R.id.backdrop);


        mTabLayout.addTab(mTabLayout.newTab().setText("첫번째"));
        mTabLayout.addTab(mTabLayout.newTab().setText("두번째"));
        mTabLayout.addTab(mTabLayout.newTab().setText("세번째"));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mViewPager = findViewById(R.id.pager);


        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setImageResource(smile);
            }
        });

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

}}
