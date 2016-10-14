package com.example.somayyeh.tourguide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent i = getIntent();
        final thing item = (thing)i.getSerializableExtra("MyClass");

        ImageView itemImage = (ImageView)findViewById(R.id.itemImage);
        itemImage.setImageResource(item.getImageResourceId());

        TextView itemTitle = (TextView)findViewById(R.id.itemName);
        itemTitle.setText(item.getThingName());

        JustifiedTextView jtv= new JustifiedTextView(getApplicationContext(), getString(item.getThingDesc()));
        LinearLayout place = (LinearLayout) findViewById(R.id.itemDesc);
        place.addView(jtv);

       // TextView itemDesc = (TextView) findViewById(R.id.itemDescription);
        //itemDesc.setText(getString(item.getThingDesc()));

        RatingBar rating = (RatingBar) findViewById(R.id.ratingBar);
        rating.setRating(Float.parseFloat(item.getThingRating()));

        ImageView itemMap = (ImageView)findViewById(R.id.itemMap);
        itemMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+item.getThingAddress()+"New South Wales, Australia");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                //mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });


    }
}
