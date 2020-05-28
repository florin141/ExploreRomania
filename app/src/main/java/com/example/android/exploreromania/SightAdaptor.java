package com.example.android.exploreromania;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.exploreromania.model.Sight;
import com.example.android.exploreromania.model.SightType;

import java.util.ArrayList;

public class SightAdaptor extends ArrayAdapter<Sight> {

    private final Context context;
    private final ArrayList<Sight> sights;

    public SightAdaptor(@NonNull Context context, @NonNull ArrayList<Sight> sights) {
        super(context, 0, sights);
        this.context = context;
        this.sights = sights;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.sight_item, parent, false);
        }

        final Sight currentSight = getItem(position);

        final ImageView sightImage = listItemView.findViewById(R.id.sight_image);
        sightImage.setImageResource(currentSight.getImageResourceId());

        final TextView sightTitle = listItemView.findViewById(R.id.sight_title);
        sightTitle.setText(currentSight.getName());

        final TextView sightDescription = listItemView.findViewById(R.id.sight_description);
        sightDescription.setText(currentSight.getDescription());

        final TextView sightLocation = listItemView.findViewById(R.id.sight_location);
        final RatingBar sightRating = listItemView.findViewById(R.id.sight_rating_bar);
        sightLocation.setText(String.format("%s in %s", currentSight.getType(), currentSight.getLocation().toString()));
        if (currentSight.getType() == SightType.River || currentSight.getType() == SightType.Road) {
            sightRating.setVisibility(View.GONE);
        } else {
            sightRating.setRating(currentSight.getRating());
        }

        final RelativeLayout backgroundMask = listItemView.findViewById(R.id.mask);

        ToggleButton hideText = listItemView.findViewById(R.id.hideText);
        hideText.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sightTitle.setVisibility(View.GONE);
                    sightDescription.setVisibility(View.GONE);
                    sightLocation.setVisibility(View.GONE);
                    sightRating.setVisibility(View.GONE);

                    if (currentSight.getType() == SightType.River || currentSight.getType() == SightType.Road) {
                        sightRating.setVisibility(View.GONE);
                    }

                    backgroundMask.setBackgroundColor(Color.argb(0, 0, 0, 0));
                } else {
                    sightTitle.setVisibility(View.VISIBLE);
                    sightDescription.setVisibility(View.VISIBLE);
                    sightLocation.setVisibility(View.VISIBLE);

                    if (currentSight.getType() != SightType.River || currentSight.getType() != SightType.Road) {
                        sightRating.setVisibility(View.VISIBLE);
                    }

                    backgroundMask.setBackgroundColor(Color.argb(95, 0, 0, 0));
                }
            }
        });

        return listItemView;
    }
}
