package com.example.android.exploreromania;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ExploreFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ExploreFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MustSeeFragment();
        } else if (position == 1) {
            return new NatureFragment();
        } else if (position == 2) {
            return new CastlesFragment();
        } else {
            return new CityFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_must_see);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_nature);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_castles);
        } else {
            return mContext.getString(R.string.tab_cities);
        }
    }
}
