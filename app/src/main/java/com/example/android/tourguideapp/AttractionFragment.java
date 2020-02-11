package com.example.android.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class AttractionFragment extends Fragment {

    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of attractions
        final ArrayList<Places> attractions = new ArrayList<>();
        attractions.add(new Places(R.string.cn_tower, R.string.cn_tower_hours,
                R.drawable.cn_tower));
        attractions.add(new Places(R.string.casa_loma, R.string.casa_loma_hours,
                R.drawable.casa_loma));
        attractions.add(new Places(R.string.royal_ontario_museum, R.string.museum_hours,
                R.drawable.royal_ontario_museum));
        attractions.add(new Places(R.string.ripley_aquarium, R.string.riplys_hours,
                R.drawable.ripleys_aquariam));
        attractions.add(new Places(R.string.science_center, R.string.science_center_hours,
                R.drawable.science_center));
        attractions.add(new Places(R.string.distillery_district, R.string.distillery_hours,
                R.drawable.distillery_district));
        attractions.add(new Places(R.string.art_gallery_of_ontario, R.string.art_gallery_of_ontario_hours,
                R.drawable.art_gallery_of_ontario));
        attractions.add(new Places(R.string.toronto_zoo, R.string.toronto_zoo_hours,
                R.drawable.toronto_zoo));

        // Create a PlacesAdapter, whose data source is a list of attractions,
        // to create list items in list view
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), attractions);

        // Find the listView object
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter so list items would be displayed
        // for each item in list
        listView.setAdapter(adapter);

        return rootView;
    }
}