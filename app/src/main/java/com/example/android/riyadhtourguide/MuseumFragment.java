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

public class MuseumFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.museum1,R.string.des_museum1, R.drawable.almasmak_museum));
        guide.add(new Guide(R.string.museum2,R.string.des_museum2, R.drawable.almurabaa));
        guide.add(new Guide(R.string.museum3, R.string.des_museum3,R.drawable.king_fahad_library));
        guide.add(new Guide(R.string.museum4, R.string.des_museum4,R.drawable.science_oasis));
        guide.add(new Guide(R.string.museum5,R.string.des_museum5, R.drawable.currency_museum));

        GuideAdapter adapter=new GuideAdapter(getActivity() , guide);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

    public MuseumFragment() {
    }
}
