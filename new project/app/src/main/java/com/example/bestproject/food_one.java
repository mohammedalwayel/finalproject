package com.example.bestproject;

import java.io.Serializable;

public class food_one implements Serializable {



    private String  name ;
    private  int    time ;
    private String timer ;
    private  int   image ;

    public food_one(String name, int time, String timer, int image) {
        this.name = name;
        this.time = time;
        this.timer = timer;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
