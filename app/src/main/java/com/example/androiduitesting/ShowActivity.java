/*
 * Resources:   I used Activity Life Cycle for help on show activity
 *              Used: https://stackoverflow.com/questions/3510649/how-to-pass-a-value-from-one-activity-to-another-in-android
 *              Accessed: Thursday Feb 29
 *              Purpose: Used to learn how to pass a bundle (holding cityName string) between the MainActivity and ShowActivity
 *
 *              Used: https://www.youtube.com/watch?v=Y1Ia3VkrKc0
 *              Accessed: Thursday Feb 29
 *              Purpose: Used to learn how to provide functionality to the back button
 */
package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ShowActivity extends AppCompatActivity {
    final private String TAG = "ShowActivity";
    TextView cityText;
    Button backButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        Bundle bundle = getIntent().getExtras();
        String cityName = null;
        if (bundle != null) {
            cityName = bundle.getString("cityName");
        }
        else {
            Log.e(TAG, "The city passed to " + TAG + " is empty");
        }

        cityText = findViewById(R.id.show_activity_text);
        cityText.setText(cityName);

        backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Log.d(TAG, "RRG onCreate() called");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "RRG onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "RRG onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "RRG onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "RRG onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "RRG onDestroy() called");
    }


}
