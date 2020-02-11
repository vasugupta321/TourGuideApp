package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of phrases.
 */
public class StadiumFragment extends Fragment {

    public StadiumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of stadiums
        final ArrayList<Places> stadiums = new ArrayList<Places>();
        stadiums.add(new Places(R.string.rogers_center, R.string.rogers_center_address,
                R.drawable.rogers_centre));
        stadiums.add(new Places(R.string.scotiabank_arena, R.string.scotiabank_address,
                R.drawable.scotia_bank_arena));
        stadiums.add(new Places(R.string.bmo_field, R.string.bmo_address,
                R.drawable.bmo_field));
        stadiums.add(new Places(R.string.coca_cola_coliseum, R.string.coca_cola_coliseum_address,
                R.drawable.coca_cola_coliseum));

        // Create a PlacesAdapter, whose data source is a list of stadiums,
        // to create list items in list view
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), stadiums);

        // Find the listView object
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter so list items would be displayed
        // for each item in list
        listView.setAdapter(adapter);

        return rootView;
    }
}