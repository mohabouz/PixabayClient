package com.mapps.pixabayclient.models;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("id")
    private long id;

    @SerializedName("pageURL")
    private String pageURL;

    @SerializedName("type")
    private String type;

    @SerializedName("tags")
    private String tags;

    @SerializedName("previewURL")
    private String previewURL;

    @SerializedName("previewWidth")
    private long previewWidth;

    @SerializedName("previewHeight")
    private long previewHeight;

    @SerializedName("webformatURL")
    private String webformatURL;

    @SerializedName("webformatWidth")
    private long webformatWidth;

    @SerializedName("webformatHeight")
    private long webformatHeight;

    @SerializedName("largeImageURL")
    private String largeImageURL;

    @SerializedName("imageWidth")
    private long imageWidth;

    @SerializedName("imageHeight")
    private long imageHeight;

    @SerializedName("imageSize")
    private long imageSize;

    @SerializedName("views")
    private long views;

    @SerializedName("downloads")
    private long downloads;

    @SerializedName("favorites")
    private long favorites;

    @SerializedName("likes")
    private long likes;

    @SerializedName("comments")
    private long comments;

    @SerializedName("user_id")
    private long userId;

    @SerializedName("user")
    private String user;

    @SerializedName("userImageURL")
    private String userImageURL;

    public Image(long id, String pageURL, String type, String tags, String previewURL, long previewWidth, long previewHeight, String webformatURL, long webformatWidth, long webformatHeight, String largeImageURL, long imageWidth, long imageHeight, long imageSize, long views, long downloads, long favorites, long likes, long comments, long userId, String user, String userImageURL) {
        this.id = id;
        this.pageURL = pageURL;
        this.type = type;
        this.tags = tags;
        this.previewURL = previewURL;
        this.previewWidth = previewWidth;
        this.previewHeight = previewHeight;
        this.webformatURL = webformatURL;
        this.webformatWidth = webformatWidth;
        this.webformatHeight = webformatHeight;
        this.largeImageURL = largeImageURL;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageSize = imageSize;
        this.views = views;
        this.downloads = downloads;
        this.favorites = favorites;
        this.likes = likes;
        this.comments = comments;
        this.userId = userId;
        this.user = user;
        this.userImageURL = userImageURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public long getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(long previewWidth) {
        this.previewWidth = previewWidth;
    }

    public long getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(long previewHeight) {
        this.previewHeight = previewHeight;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    public long getWebformatWidth() {
        return webformatWidth;
    }

    public void setWebformatWidth(long webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    public long getWebformatHeight() {
        return webformatHeight;
    }

    public void setWebformatHeight(long webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public long getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(long imageWidth) {
        this.imageWidth = imageWidth;
    }

    public long getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(long imageHeight) {
        this.imageHeight = imageHeight;
    }

    public long getImageSize() {
        return imageSize;
    }

    public void setImageSize(long imageSize) {
        this.imageSize = imageSize;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public long getFavorites() {
        return favorites;
    }

    public void setFavorites(long favorites) {
        this.favorites = favorites;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public long getComments() {
        return comments;
    }

    public void setComments(long comments) {
        this.comments = comments;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }
    
}
