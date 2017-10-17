package com.example.android.riyadhtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Toshiba on 08/08/17.
 */

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.restaurant1, R.string.des_restaurant1,R.drawable.lusin));
        guide.add(new Guide(R.string.restaurant2,R.string.des_restaurant2, R.drawable.bateel));
        guide.add(new Guide(R.string.restaurant3, R.string.des_restaurant3,R.drawable.nozomi));
        guide.add(new Guide(R.string.restaurant4, R.string.des_restaurant4,R.drawable.alorjouan));
        guide.add(new Guide(R.string.restaurant5,R.string.des_restaurant5, R.drawable.alnajdiyah_village));

        GuideAdapter adapter=new GuideAdapter(getActivity() , guide);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

    public RestaurantFragment() {
    }
}
