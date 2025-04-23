package com.IronHack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("W1 Day 2 lesson");


        //ARRAYS

        String[] days = {"Mondays", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        System.out.println(days[1]);
        System.out.println(days.length);           //  numero de elementos del Array
        System.out.println(days[days.length - 1]);   // ultimo del Array
        // System.out.println(days[days.length]);   //  out of bounds

        String[] subjectArray = createSubjectArray();

        System.out.println(Arrays.toString(subjectArray));


        //LOOPS

        //  for loop
        for (int i = -10; i <= 100; i++) {
            System.out.println(i);
        }


        for (int i = 0; i < subjectArray.length; i++) {
            System.out.println(i + " : " + subjectArray[i]);
        }


        // loop para numeros pares
        int[] evenNumbers = new int[51];
        //for (int i = 0; <= 100; i++) {
        //}


        // WHILE LOOP

        int counter = 0;

        while (counter < 10) {
            System.out.println("Counter: " + counter);
            counter++;

        }


        //  DO WHILE LOOP

        counter = 100;
        do {
            System.out.println("Counter: " + counter);
            counter++;

        } while (counter < 110);



        //  ARRAYLIST
        List<String> countries = new ArrayList<>();     //  crear lista

        countries.add("Spain");
        countries.add("Argentina");
        countries.add("France");

        System.out.println(countries);         //  ver lista en consola
        System.out.println(countries.get(2));  //  obtener un valor de un indice
        countries.set(2,"Argelia");            //  Modificar elemento de la lista
        System.out.println(countries);
        System.out.println(countries.size());     //  numero de elementos
        countries.remove(2);                // eliminar elemento
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }


        //ADD ELEMENT TO ARRAY
        int [] numbers = {0,1,2,3,4};
        // numbers[5] = 5;  this cannot be done as its out of bounds
        System.out.println(numbers);
        int [] newNumbers = new int[6];   //  crear ARRAY nuevo de 6 elementos
        for (int i = 0; i < numbers.length; i++){
            newNumbers[i] = numbers[i];

        }
        newNumbers[5] = 5;


    //  MATH CLASS & CAST
        System.out.println(Math.sqrt(64));    //  raiz cuadrada , regresa double aunque input sea integer
        System.out.println(Math.pow(2,5));
        System.out.println((int) Math.pow(2,5));   // resultado como int
        System.out.println(Math.ceil(3.75));   // redondear hacia arriba
        System.out.println(Math.floor(3.75)); //  redondear hacia abajo



        //foreach loop
        //  funciona para recorrer un Array

        for (String subject : subjectArray) {
            System.out.println(subject);
        }

    }


    public static String[] createSubjectArray() {
        String[] subjects = new String[5];       //  para crear un Array con 5 spots
        subjects[0] = "Math";                      //  asignar valor a la posicion  0
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;


    }

}
