package com.example.android.fivewaystomakemoneyfromanapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fast on 5/19/2016.
 */
public class SurpriseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surprise_layout);
    }
    public void getHome(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Home"))
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
    public void goBack(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Back"))
        {
            Intent intent = new Intent(this, FifthActivity.class);
            startActivity(intent);
        }

    }
}
