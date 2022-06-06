package com.example.mobileproject527;

public class SampleData {
    private int poster;
    private String detail, date;

    public SampleData(int poster, String detail, String date) {
        this.poster = poster;
        this.detail = detail;
        this.date = date;
    }

    public int getPoster() {
        return this.poster;
    }

    public String getDetail() {
        return this.detail;
    }

    public String getDate() {
        return this.date;
    }
}

