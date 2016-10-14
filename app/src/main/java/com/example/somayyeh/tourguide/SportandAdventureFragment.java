package com.example.somayyeh.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportandAdventureFragment extends Fragment {


    public SportandAdventureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.category_list,container,false);

        final ArrayList<thing> things = new ArrayList<thing>();
        things.add(new thing(R.drawable.olympic_bike,"Olympic Park Bikes" , R.string.olympic_park_bike,"3.5","Sydney Olympic Park, "));
        things.add(new thing(R.drawable.manly_cycling,"Manly Beach Cyling", R.string.olympic_park_bike,"3.5","North Stain, Manly, "));
        things.add(new thing(R.drawable.centenialparklandshorseriding,"Centenial Parklands Horseriding",R.string.olympic_park_bike,"3.5","Grand Drive, Centennial Park, "));
        things.add(new thing(R.drawable.osborne_park_tennis_club,"Osborne Park Tennis Club",R.string.olympic_park_bike,"3.5","Osborne Pl, Lane Cove, "));
        things.add(new thing(R.drawable.longueville_tennis_club,"Longueville Tennis Club",R.string.olympic_park_bike,"3.5","Kenneth Street, Longueville, "));
        things.add(new thing(R.drawable.akuna_bay_boat_hire, "Akuna Bay Boat Hire",R.string.olympic_park_bike,"3.5","Ku-Ring-Gai Chase, "));
        things.add(new thing(R.drawable.lanecove_river_tourist_park_camping,"Lane Cove River Tourist Park Camping",R.string.olympic_park_bike,"3.5","Plassey Road, Macquarie Park, "));
        things.add(new thing(R.drawable.cokatooislandcamping,"Cockatoo Island Camping",R.string.olympic_park_bike,"3.5","Sydney, "));
        things.add(new thing(R.drawable.manlywhalewatching,"Manly Whale Watching",R.string.olympic_park_bike,"3.5","Manly, "));

        thingAdapter itemsAdapter = new thingAdapter(getActivity(),things);
        GridView list = (GridView) rootView.findViewById(R.id.gridview);
        list.setAdapter(itemsAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showDetails(things.get(position));

            }
        });

        return rootView;

            }

    void showDetails(thing item) {

            Intent intent = new Intent();

            // explicitly set the activity context and class
            // associated with the intent (context, class)
            intent.setClass(getActivity(), DetailsActivity.class);

            // pass the current item
           intent.putExtra("MyClass", item);

            startActivity(intent);
        }


        }
