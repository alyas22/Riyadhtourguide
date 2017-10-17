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

public class MallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.mall1, R.string.des_mall1,R.drawable.alnakheel_mall));
        guide.add(new Guide(R.string.mall2, R.string.des_mall2,R.drawable.panorama_mall));
        guide.add(new Guide(R.string.mall3,R.string.des_mall3, R.drawable.centria));
        guide.add(new Guide(R.string.mall4, R.string.des_mall4,R.drawable.kingdom_centre));
        guide.add(new Guide(R.string.mall5,R.string.des_mall5, R.drawable.alfaisaliyah_mall));
        guide.add(new Guide(R.string.mall6,R.string.des_mall6, R.drawable.granada_center));
        guide.add(new Guide(R.string.mall7,R.string.des_mall7, R.drawable.riyadh_gallery));
        guide.add(new Guide(R.string.mall8,R.string.des_mall8, R.drawable.hayat_mall));

        GuideAdapter adapter=new GuideAdapter(getActivity() , guide);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

    public MallFragment() {
    }
}
