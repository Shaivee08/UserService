package com.data.userinfo.entity;

public class Rating {
    private String userId;
    private String ratingId;
    private String hotelId;
    private int rating;
    private String feedback;

    public Rating() {
    }

    public Rating(String userId, String ratingId, String hotelId, int rating, String remark) {
        this.userId = userId;
        this.ratingId = ratingId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedback = remark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String remark) {
        this.feedback = remark;
    }
}
