package com.lazydevelopers.navigation_view_multiple_activities.Other;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kinzi on 11/9/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    List<String> titles=new ArrayList<>();
    List<Fragment>fragment=new ArrayList<>();



    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);

    }
    public void addFragments(Fragment fm, String s){
        fragment.add(fm);
        titles.add(s);
    }
    public void setTitles(List<String> titles) {
        this.titles = titles;
    }


    @Override
    public CharSequence getPageTitle(int position) {
      return titles.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

}
