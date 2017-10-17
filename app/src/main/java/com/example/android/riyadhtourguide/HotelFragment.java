package com.example.android.riyadhtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.hotel1, R.string.des_hotel1, R.drawable.novotel));
        guide.add(new Guide(R.string.hotel2,R.string.des_hotel2, R.drawable.alkhozama));
        guide.add(new Guide(R.string.hotel3,R.string.des_hotel3, R.drawable.four_seasons));
        guide.add(new Guide(R.string.hotel4,R.string.des_hotel4, R.drawable.marriott));
        guide.add(new Guide(R.string.hotel5,R.string.des_hotel5, R.drawable.novotel_alanoud));
        guide.add(new Guide(R.string.hotel6,R.string.des_hotel6, R.drawable.intercontinental));
        guide.add(new Guide(R.string.hotel7,R.string.des_hotel7, R.drawable.narcissus));
        guide.add(new Guide(R.string.hotel8, R.string.des_hotel8,R.drawable.movenpick));

        GuideAdapter adapter=new GuideAdapter(getActivity() , guide);
        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

}
