package pl.bobrzadywizja.gooddoggo.model;

import com.google.gson.annotations.SerializedName;

public class Dog {

    @SerializedName("image") private String imageUrl;

    public Dog(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
