package pl.bobrzadywizja.gooddoggo.repository.remote;

import java.util.List;

import pl.bobrzadywizja.gooddoggo.model.Dog;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DogCeoApi {

//    @GET("breeds/list/all")
//    Call<List<Dog>> listDogs();
//
//    @GET("breeds/list")
//    Call<List<String>> listBreeds();
//
//    @GET("breed/{breed}/images")
//    Call<List<Dog>> listDogs(@Path("breed") String breed);

    @GET("breeds/image/random")
    Call<Dog> randomDoggo();

    @GET("breeds/{breed}/images/random")
    Call<Dog> randomDoggo(@Path("breed") String breed);
}
