package com.example.screamitus_android;

import android.app.Activity;
import android.widget.EditText;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

public class Activity2 {


    MainActivity mainActivity;
    @Before
    public void setUp() throws Exception {
        mainActivity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }
    //r1
    @Test
    public void DaysGreaterThanZero()
    {
        EditText days = (EditText)mainActivity.findViewById(R.id.daysTextBox);
        String numberOfDays = days.getText().toString();
    }

}