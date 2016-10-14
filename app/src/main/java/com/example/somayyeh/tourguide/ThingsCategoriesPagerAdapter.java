package com.example.somayyeh.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by somayyeh on 7/31/16.
 */
public class ThingsCategoriesPagerAdapter extends FragmentPagerAdapter {
    Context mContext;
    public ThingsCategoriesPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SportandAdventureFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new NatureFragment();
            case 4:
                return new KidsFragment();

            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getResources().getString(R.string.Sport_Adventure_Fragment);
            case 1:
                return mContext.getResources().getString(R.string.Food_Fragment);
            case 2:
                return mContext.getResources().getString(R.string.Shopping_Fragment);
            case 3:
                return mContext.getResources().getString(R.string.Nature_Fragment);
            case 4:
                return mContext.getResources().getString(R.string.Kids_Fragment);

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
