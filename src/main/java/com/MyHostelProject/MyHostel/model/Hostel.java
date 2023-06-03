package com.MyHostelProject.MyHostel.model;

public class Hostel{

    private int hostelId;
    private String hostelName;
    private String location;
    private String about;

    public Hostel(){

    }

    public Hostel(int hostelId, String hostelName, String location, String about) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.location = location;
        this.about = about;
    }

    public int getHostelId() {
        return hostelId;
    }

    public void setHostelId(int hostelId) {
        this.hostelId = hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "HostelModel{" +
                "hostelId=" + hostelId +
                ", hostelName='" + hostelName + '\'' +
                ", location='" + location + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}

