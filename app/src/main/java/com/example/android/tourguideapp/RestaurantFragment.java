package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of restaurants
        final ArrayList<Places> restaurants = new ArrayList<Places>();
        restaurants.add(new Places(R.string.symposium_cafe, R.string.symposium_contact));
        restaurants.add(new Places(R.string.scaramouche_restaurant,R.string.scaramouche_contact));
        restaurants.add(new Places(R.string.moxies_bar_grill, R.string.moxies_hours));
        restaurants.add(new Places(R.string.alo_restaurant, R.string.alo_hours));
        restaurants.add(new Places(R.string.scadabush, R.string.scadabush_hours));
        restaurants.add(new Places(R.string.boston_pizza, R.string.boston_pizza_contact));
        restaurants.add(new Places(R.string.canoe_restaurant_and_bar, R.string.canoe_contact));
        restaurants.add(new Places(R.string.earls, R.string.earls_contact));

        // Create a PlacesAdapter, whose data source is a list of restaurants,
        // to create list items in list view
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), restaurants);

        // Find the listView object
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter so list items would be displayed
        // for each item in list
        listView.setAdapter(adapter);

        return rootView;
    }
}