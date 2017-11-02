package pl.bobrzadywizja.gooddoggo.repository.remote;

import pl.bobrzadywizja.gooddoggo.model.Dog;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DogDummyApi {

    @GET("/")
    Call<Dog> doggo();

}
