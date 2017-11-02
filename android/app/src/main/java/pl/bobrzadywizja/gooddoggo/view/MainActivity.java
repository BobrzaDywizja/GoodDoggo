package pl.bobrzadywizja.gooddoggo.view;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pl.bobrzadywizja.gooddoggo.R;
import pl.bobrzadywizja.gooddoggo.model.Dog;
import pl.bobrzadywizja.gooddoggo.model.DogTypeAdapterFactory;
import pl.bobrzadywizja.gooddoggo.repository.remote.DogCeoApi;
import pl.bobrzadywizja.gooddoggo.repository.remote.DogDummyApi;
import pl.bobrzadywizja.gooddoggo.viewmodel.DogViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    DogViewModel dogViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean welcomed = preferences.getBoolean("welcomed", false);
        if (!welcomed) {
            startActivity(new Intent(this, WelcomeActivity.class));
            finish();
        }


        setContentView(R.layout.activity_main);



        dogViewModel = ViewModelProviders.of(this).get(DogViewModel.class);



    }
}
