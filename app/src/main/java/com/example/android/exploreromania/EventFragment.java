package com.example.android.exploreromania;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.android.exploreromania.model.Event;

import java.util.ArrayList;

public class EventFragment extends Fragment {

    private ArrayList<Event> events = new ArrayList<>();

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        events.add(new Event("Untold", "", null, 1));
        events.add(new Event("Untold", "", null, 1));
        events.add(new Event("Untold", "", null, 1));
        events.add(new Event("Untold", "", null, 1));

        EventAdaptor adaptor = new EventAdaptor(getActivity(), events);

        GridView listView = rootView.findViewById(R.id.event_grid);

        listView.setAdapter(adaptor);

        return rootView;
    }
}
