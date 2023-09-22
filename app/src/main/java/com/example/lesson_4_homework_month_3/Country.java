package com.example.lesson_4_homework_month_3;

public class Country {

    private String img;
    private  String countryName;

    public Country(String img, String countryName) {
        this.img = img;
        this.countryName = countryName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}