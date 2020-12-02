package com.bhupender.retrofitget;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Placeholder_JSON {
    @GET("posts") // its the relative url copy the url here for / part
    Call<List<Post>> getPosts();
}
