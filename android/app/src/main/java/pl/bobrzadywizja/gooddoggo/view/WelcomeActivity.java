package pl.bobrzadywizja.gooddoggo.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import pl.bobrzadywizja.gooddoggo.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean welcomed = preferences.getBoolean("welcomed", false);
        if (welcomed) finish();

        setContentView(R.layout.activity_welcome);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            preferences.edit().putBoolean("welcomed", true).apply();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}
