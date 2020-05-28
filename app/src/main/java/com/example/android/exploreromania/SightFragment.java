package com.example.android.exploreromania;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.android.exploreromania.model.Sight;

import java.util.ArrayList;

public abstract class SightFragment extends Fragment {

    SightAdaptor adaptor;

    public SightFragment() {
        // Required empty public constructor
    }

    abstract ArrayList<Sight> getSights();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_sight, container, false);

        adaptor = new SightAdaptor(getActivity(), getSights());

        ListView listView = rootView.findViewById(R.id.sight_list);

        listView.setAdapter(adaptor);

        return rootView;
    }
}
