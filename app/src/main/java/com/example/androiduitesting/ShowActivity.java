/*
 * Resources: I used Activity Life Cycle for help on show activity
 */
package com.example.androiduitesting;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
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
