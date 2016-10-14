package com.example.somayyeh.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by somayyeh on 7/31/16.
 */
public class thingAdapter extends ArrayAdapter<thing> {
    public thingAdapter(Context context, ArrayList<thing> things) {
        super(context, 0 ,things);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridItemView = convertView;
        if(gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        thing currentItem = getItem(position);
        ImageView itemImage = (ImageView) gridItemView.findViewById(R.id.itemImage);
        itemImage.setImageResource(currentItem.getImageResourceId());
        TextView itemName = (TextView) gridItemView.findViewById(R.id.itemName);
        itemName.setText("" + currentItem.getThingName());

        return gridItemView;

    }
}
