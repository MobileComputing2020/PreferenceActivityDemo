package com.sleepycoder.preferencesactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String signature = PreferenceManager.getDefaultSharedPreferences(this).getString("signature","not found");

        Toast.makeText(this, signature, Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
