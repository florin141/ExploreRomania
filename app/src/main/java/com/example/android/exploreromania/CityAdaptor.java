package com.example.android.exploreromania;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.exploreromania.model.City;

import java.util.ArrayList;

public class CityAdaptor extends ArrayAdapter<City> {

    private final Context context;
    private final ArrayList<City> cities;

    public CityAdaptor(@NonNull Context context, @NonNull ArrayList<City> cities) {
        super(context, 0, cities);
        this.context = context;
        this.cities = cities;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.city_item, parent, false);
        }

        City currentCity = getItem(position);

        ImageView cityImage = listItemView.findViewById(R.id.city_image);
        cityImage.setImageResource(currentCity.getImageResourceId());

        TextView cityName = listItemView.findViewById(R.id.city_name);
        cityName.setText(currentCity.getName());

        TextView cityDesc = listItemView.findViewById(R.id.city_desc);
        cityDesc.setText(currentCity.getShortDescription());

        return listItemView;
    }
}
