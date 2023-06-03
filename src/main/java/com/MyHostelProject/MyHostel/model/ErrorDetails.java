package com.MyHostelProject.MyHostel.model;

import java.time.LocalDate;

public class ErrorDetails {

    private LocalDate timeStamp;
    private String message;
    private String description;

//    public ErrorDetails(LocalDate now, String message, String description) {
//    }

    public ErrorDetails(LocalDate timeStamp, String message, String description){
        this.timeStamp = timeStamp;
        this.message = message;
        this.description = description;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
