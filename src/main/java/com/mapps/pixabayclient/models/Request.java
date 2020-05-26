package com.mapps.pixabayclient.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Request {

    @SerializedName("total")
    private long total;

    @SerializedName("totalHits")
    private long totalHits;

    @SerializedName("hits")
    private List<Image> hits = null;

    public Request(long total, long totalHits, List<Image> hits) {
        this.total = total;
        this.totalHits = totalHits;
        this.hits = hits;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }

    public List<Image> getImages() {
        return hits;

    }

    public void setHits(List<Image> hits) {
        this.hits = hits;
    }

}
