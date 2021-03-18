package com.moringaschool.myrestaurants;

import android.widget.TextView;

//import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup()throws Exception{
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void validateTextViewContent() {
        TextView MyRestaurantsTextView=activity.findViewById(R.id.MyRestaurantTextView);
        assertTrue("MyRestaurants".equals(MyRestaurantsTextView.getText().toString()));

    }
}
