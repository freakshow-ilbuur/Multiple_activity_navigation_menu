package com.lazydevelopers.navigation_view_multiple_activities.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.lazydevelopers.navigation_view_multiple_activities.Other.TabsPagerAdapter;
import com.lazydevelopers.navigation_view_multiple_activities.R;

/**
 * Created by Kinzi on 14/9/2017.
 */

public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tablayout;
    private static int navItemIndex=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        viewPager=(ViewPager)findViewById(R.id.pager);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        setSupportActionBar(toolbar);

        tablayout=(TabLayout)findViewById(R.id.tabs);


        if(hideSlideMenu()){
            tablayout.setVisibility(View.GONE);
        }
        else{
            setupViewPager(viewPager);

            tablayout.setupWithViewPager(viewPager);
        }



        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent i;
                switch (item.getItemId()) {


                    case R.id.one:
                        navItemIndex=0;
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.two:
                        navItemIndex=1;
                        i = new Intent(getApplicationContext(), SecondActivity.class);
                        startActivity(i);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.three:
                        navItemIndex=2;
                        i = new Intent(getApplicationContext(), ThirdActivity.class);
                        startActivity(i);
                        drawerLayout.closeDrawers();
                        break;


                }
                return false;
            }
        });

        navigationView.getMenu().getItem(navItemIndex).setChecked(true);
    }



    public  void setupViewPager(ViewPager viewPager) {
        TabsPagerAdapter adapter=new TabsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public boolean hideSlideMenu(){
        return true;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if(navItemIndex!=0){
            navItemIndex=0;
        }
        super.onBackPressed();
    }
}
