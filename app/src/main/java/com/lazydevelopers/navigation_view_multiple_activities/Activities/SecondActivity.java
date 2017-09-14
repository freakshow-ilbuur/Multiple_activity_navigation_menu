package com.lazydevelopers.navigation_view_multiple_activities.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;

import com.lazydevelopers.navigation_view_multiple_activities.Fragments.FragmentOne;
import com.lazydevelopers.navigation_view_multiple_activities.Fragments.FragmentThree;
import com.lazydevelopers.navigation_view_multiple_activities.Fragments.FragmentTwo;
import com.lazydevelopers.navigation_view_multiple_activities.Other.TabsPagerAdapter;
import com.lazydevelopers.navigation_view_multiple_activities.R;

/**
 * Created by Kinzi on 14/9/2017.
 */

public class SecondActivity extends BaseActivity {
    public void setupViewPager(ViewPager viewPager) {

        TabsPagerAdapter adapter = new TabsPagerAdapter(this.getSupportFragmentManager());
        adapter.addFragments(new FragmentOne(), "One");
        adapter.addFragments(new FragmentTwo(), "Two");

        adapter.addFragments(new FragmentThree(), "Three");

        viewPager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout)findViewById(R.id.activity_content);

        this.getLayoutInflater().inflate(R.layout.activity_second, contentFrameLayout);

    }

    @Override
    public boolean hideSlideMenu() {
        return false;
    }
}
