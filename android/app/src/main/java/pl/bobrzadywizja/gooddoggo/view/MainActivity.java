package pl.bobrzadywizja.gooddoggo.view;

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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

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



        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new DogTypeAdapterFactory())
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://cyberdeer.usermd.net/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        DogDummyApi dummyApi = retrofit.create(DogDummyApi.class);
        dummyApi.doggo().enqueue(new Callback<Dog>() {
            @Override
            public void onResponse(Call<Dog> call, Response<Dog> response) {
                Log.e("dawd", "SUCCESS");
                Log.e("####", String.valueOf(response.body()));
            }

            @Override
            public void onFailure(Call<Dog> call, Throwable t) {}
        });
    }
}
