package pl.bobrzadywizja.gooddoggo.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import pl.bobrzadywizja.gooddoggo.model.Dog;
import pl.bobrzadywizja.gooddoggo.repository.DogRepository;

public class DogViewModel extends ViewModel {

    private DogRepository dogRepository;
    private LiveData<Dog> dogObservable;

    public void onFabClicked() {

    }
}
