package com.mapps.pixabayclient;

import androidx.annotation.Nullable;

import com.mapps.pixabayclient.data.APIServiceInterface;
import com.mapps.pixabayclient.models.Image;
import com.mapps.pixabayclient.models.Request;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PixabayClient {

    private String apiKey;

    public PixabayClient(String apiKey) {
        this.apiKey = apiKey;
    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pixabay.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private APIServiceInterface apiServiceInterface = retrofit.create(APIServiceInterface.class);

    public void getRequest(final RequestListener requestListener) {

        Call<Request> requestCallback = apiServiceInterface.getRequest(apiKey);
        requestCallback.enqueue(new Callback<Request>() {
            @Override
            public void onResponse(Call<Request> call, Response<Request> response) {
                requestListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<Request> call, Throwable t) {
                requestListener.onFailure(t);
            }
        });
    }

    public void getImages(final ImagesListener imagesListener) {
        Call<Request> requestCallback = apiServiceInterface.getRequest(apiKey);
        requestCallback.enqueue(new Callback<Request>() {
            @Override
            public void onResponse(Call<Request> call, Response<Request> response) {
                imagesListener.onSuccess(response.body().getImages());
            }

            @Override
            public void onFailure(Call<Request> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImage(int id, final ImageListener imageListener) {
        Call<Image> requestCallback = apiServiceInterface.getImage(id,apiKey);
        requestCallback.enqueue(new Callback<Image>() {
            @Override
            public void onResponse(Call<Image> call, Response<Image> response) {
                imageListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<Image> call, Throwable t) {
                imageListener.onFailure(t);
            }
        });
    }

    public void getImagesByOrientation(String orientation, final ImagesListener imagesListener) {
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesByOrientation(orientation,apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(Call<List<Image>> call, Response<List<Image>> response) {
                imagesListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImagesByCategory(String category, final ImagesListener imagesListener) {
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesByCategory(category, apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImagesByColor(String color, final ImagesListener imagesListener){
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesByColor(color, apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImagesByType(String type, final ImagesListener imagesListener) {
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesByType(type, apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImagesWithMinWidth(int minWidth, final ImagesListener imagesListener) {
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesWithMinWidth(minWidth, apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getImagesWithMinHeight(int minHeight, final ImagesListener imagesListener) {
        Call<List<Image>> imagesCallback = apiServiceInterface.getImagesWithMinHeight(minHeight, apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public void getEditorsChoiceImages(final ImagesListener imagesListener){
        Call<List<Image>> imagesCallback = apiServiceInterface.getEditorsChoiceImages(apiKey);
        imagesCallback.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(@Nullable Call<List<Image>> call, @Nullable Response<List<Image>> response) {
                if (response != null) {
                    imagesListener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(@Nullable Call<List<Image>> call, Throwable t) {
                imagesListener.onFailure(t);
            }
        });
    }

    public interface RequestListener {
        void onSuccess(Request request);
        void onFailure(Throwable t);
    }

    public interface ImagesListener {
        void onSuccess(List<Image> imagesList);
        void onFailure(Throwable t);
    }

    public interface  ImageListener {
        void onSuccess(Image image);
        void onFailure(Throwable t);
    }

}
