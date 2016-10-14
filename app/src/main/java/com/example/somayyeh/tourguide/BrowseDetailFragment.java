package com.example.somayyeh.tourguide;

import android.app.Fragment;

/**
 * Created by somayyeh on 8/1/16.
 */
public class BrowseDetailFragment extends Fragment {

    private int position;

    public static BrowseDetailFragment newInstance(int position) {
        BrowseDetailFragment fragment = new BrowseDetailFragment();
        fragment.position = position;
        return fragment;
    }

    public BrowseDetailFragment() {
        //Required empty constructor
    }

    //Lifecycle methods and logics
}