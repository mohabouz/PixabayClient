package com.mapps.pixabayclient.data;

import com.mapps.pixabayclient.models.Image;
import com.mapps.pixabayclient.models.Request;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIServiceInterface {

    @GET("api/")
    Call<Request> getRequest(@Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImages(@Query("page") int page, @Query("key") String key);

    @GET("api/")
    Call<Image> getImage(@Query("id") int id, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesPerPage(@Query("per_page") int number, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesByOrientation(@Query("orientation") String orientation, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesByCategory(@Query("category") String category, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesByColor(@Query("color") String color, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesByType(@Query("image_type") String color, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesWithMinWidth(@Query("min_width") int color, @Query("key") String key);

    @GET("api/")
    Call<List<Image>> getImagesWithMinHeight(@Query("min_height") int color, @Query("key") String key);

    @GET("api/?editors_choice=true")
    Call<List<Image>> getEditorsChoiceImages(@Query("key") String key);

}
