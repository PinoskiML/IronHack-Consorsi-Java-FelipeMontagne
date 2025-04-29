package com.IronHack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter",180);
        Movie madMax = new Movie("Mad Max");


        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());   //  usar getters



        //Para usar setters:   nombre del Objeto.set

    harryPotter.setDuration(3);
    System.out.println(harryPotter.getDuration());

    System.out.println(madMax.getTitle() + " "+ madMax.getDuration());

        System.out.println(madMax);
        System.out.println(madMax.IS_GOOD);

    harryPotter.play();
    madMax.play();

    Movie.displayAlert();

    HorrorMovie scream = new HorrorMovie("Scream", 99, false);
        System.out.println(scream.getTitle() + " " + scream.getDuration()+ " "+ scream.isReallyScary());
        scream.play();





    }
}

