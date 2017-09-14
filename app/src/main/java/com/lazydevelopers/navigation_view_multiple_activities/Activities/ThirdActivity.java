package com.lazydevelopers.navigation_view_multiple_activities.Activities;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.lazydevelopers.navigation_view_multiple_activities.R;

/**
 * Created by Kinzi on 14/9/2017.
 */

public class ThirdActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout)findViewById(R.id.activity_content);
        this.getLayoutInflater().inflate(R.layout.activity_three, contentFrameLayout);
       ;
    }
}
