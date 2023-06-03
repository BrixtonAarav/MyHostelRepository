package com.MyHostelProject.MyHostel.model;

public class Rating {


    private String ratingId;
    private int userId;
    private int hostelId;
    private int rating;
    private String feedback;

    private Hostel hostel;

    public Rating(String ratingId, int userId, int hostelId, int rating, String feedback, Hostel hostel) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hostelId = hostelId;
        this.rating = rating;
        this.feedback = feedback;
        this.hostel = hostel;
    }

    public Rating() {
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHostelId() {
        return hostelId;
    }

    public void setHostelId(int hostelId) {
        this.hostelId = hostelId;
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

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", userId=" + userId +
                ", hostelId=" + hostelId +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                ", hostel=" + hostel +
                '}';
    }
}

