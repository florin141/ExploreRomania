package com.example.android.exploreromania;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.exploreromania.model.Event;

import java.util.ArrayList;

public class EventAdaptor extends ArrayAdapter<Event> {

    private final Context context;
    private final ArrayList<Event> events;

    public EventAdaptor(@NonNull Context context, @NonNull ArrayList<Event> events) {
        super(context, 0, events);
        this.context = context;
        this.events = events;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.event_item, parent, false);
        }

        Event currentEvent = getItem(position);

//        ImageView albumCover = listItemView.findViewById(R.id.album_cover);
//        albumCover.setImageResource(currentAlbum.getCover());
//
        TextView eventName = listItemView.findViewById(R.id.event_name);
        eventName.setText(currentEvent.getName());
//
//        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
//        artistNameTextView.setText(currentAlbum.getArtist().toString());

        return listItemView;
    }
}
