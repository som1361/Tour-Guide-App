package com.example.somayyeh.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    ThingsCategoriesPagerAdapter categoriesPagerAdapter;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // identify ViewPager used in xml file
        mViewPager = (ViewPager)findViewById(R.id.pager);

        //create an instance of ViewPagerAdapter class
        categoriesPagerAdapter = new ThingsCategoriesPagerAdapter(getSupportFragmentManager(), this);

        //attach ViewPagerAdapter to ViewPager
        mViewPager.setAdapter(categoriesPagerAdapter);

        //identify xml file TabLayout
        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(mViewPager);

    }
}
