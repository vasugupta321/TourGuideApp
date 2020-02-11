package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of shopping malls
        final ArrayList<Places> shoppingMalls = new ArrayList<Places>();
        shoppingMalls.add(new Places(R.string.eaton_center, R.string.eaton_center_contact,
                R.drawable.eaton_center));
        shoppingMalls.add(new Places(R.string.vaughan_mills, R.string.vaughan_mills_hours,
                R.drawable.vaughan_mills));
        shoppingMalls.add(new Places(R.string.premium_outlets, R.string.premium_outlets_contact,
                R.drawable.toronto_premium_outlets));
        shoppingMalls.add(new Places(R.string.sherway_gardens, R.string.sherway_gardens_hours,
                R.drawable.sherway_gardens));
        shoppingMalls.add(new Places(R.string.yorkdale_shopping_center, R.string.yorkdale_shopping_center_hours,
                R.drawable.yorkdale));
        shoppingMalls.add(new Places(R.string.square_one, R.string.square_one_hours,
                R.drawable.square_one));
        shoppingMalls.add(new Places(R.string.woodbine_mall, R.string.woodbine_mall_hours,
                R.drawable.woodbine));
        shoppingMalls.add(new Places(R.string.dixie_outlet_mall, R.string.dixie_outlet_mall_hours,
                R.drawable.dixie_outlet));

        // Create a PlacesAdapter, whose data source is a list of shopping malls,
        // to create list items in list view
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), shoppingMalls);

        // Find the listView object
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter so list items would be displayed
        // for each item in list
        listView.setAdapter(adapter);

        return rootView;
    }
}