package com.example.android.riyadhtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Toshiba on 08/08/17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HotelFragment tab1 = new HotelFragment();
                return tab1;
            case 1:
                MallFragment tab2 = new MallFragment();
                return tab2;
            case 2:
                RestaurantFragment tab3 = new RestaurantFragment();
                return tab3;
            case 3:
                MuseumFragment tab4 = new MuseumFragment();
                return tab4;
        }
        return null;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.hotel_fragment);
        } else if (position == 1) {
            return context.getString(R.string.mall_fragment);
        } else if (position == 2) {
            return context.getString(R.string.restaurant_fragment);
        } else {
            return context.getString(R.string.museum_fragment);
        }
    }}