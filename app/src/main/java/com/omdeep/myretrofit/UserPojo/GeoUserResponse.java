package com.omdeep.myretrofit.UserPojo;

import com.google.gson.annotations.SerializedName;

public class GeoUserResponse {

    @SerializedName("lat")
    private String lat;

    @SerializedName("lng")
    private String lng;

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
