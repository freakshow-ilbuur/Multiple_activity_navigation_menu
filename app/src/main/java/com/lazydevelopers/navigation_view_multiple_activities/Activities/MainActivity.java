package com.lazydevelopers.navigation_view_multiple_activities.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.lazydevelopers.navigation_view_multiple_activities.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout)findViewById(R.id.activity_content);
        getLayoutInflater().inflate(R.layout.activity_main, contentFrameLayout,true);
        setTitle(getResources().getString(R.string.activity_one_title));
    }
}
