package com.example.android.exploreromania;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.exploreromania.model.City;

import java.util.ArrayList;

public class CityFragment extends Fragment {

    private ArrayList<City> cities = new ArrayList<>();

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_city, container, false);

        cities.add(new City(getString(R.string.bucharest_city_name), getString(R.string.bucharest_city_desc), R.drawable.bucharest));
        cities.add(new City(getString(R.string.timisoara_city_name), getString(R.string.timisoara_city_desc), R.drawable.timisoara));
        cities.add(new City(getString(R.string.sibiu_city_name), getString(R.string.sibiu_city_desc), R.drawable.sibiu));
        cities.add(new City(getString(R.string.cluj_city_name), getString(R.string.cluj_city_desc), R.drawable.cluj_napoca));
        cities.add(new City(getString(R.string.brasov_city_name), getString(R.string.brasov_city_desc), R.drawable.brasov));
        cities.add(new City(getString(R.string.sighisoara_city_name), getString(R.string.sighisoara_city_desc), R.drawable.sighisoara));
        cities.add(new City(getString(R.string.iasi_city_name), getString(R.string.iasi_city_desc), R.drawable.iasi));
        cities.add(new City(getString(R.string.constanta_city_name), getString(R.string.constanta_city_desc), R.drawable.constanta));

        CityAdaptor adaptor = new CityAdaptor(getActivity(), cities);

        ListView listView = rootView.findViewById(R.id.city_list);

        listView.setAdapter(adaptor);

        return rootView;
    }
}
