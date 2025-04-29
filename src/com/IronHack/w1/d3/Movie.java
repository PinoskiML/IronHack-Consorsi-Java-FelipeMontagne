package com.IronHack.w1.d3;

public class Movie {
    private String title;
    private int duration;
    public final boolean IS_GOOD = true;

    //metodo constructor permite hacer metodos para usar las propiedades


    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    public Movie(String title) {
        this.title = title;
        this.duration = 69;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }


    //Setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void play(){
        System.out.println("now playing " + this.title);

    }



    //TO String

    @Override
    public String toString() {
        return "Movie title: " + title + ' ' + ", Duration: " + duration;
    }


    //Metodo estatic
    public static void displayAlert(){
        System.out.println("Please don't pirate me!\n");
    }




}

