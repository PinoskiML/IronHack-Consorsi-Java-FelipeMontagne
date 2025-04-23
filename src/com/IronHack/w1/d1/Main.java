package com.IronHack.w1.d1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Howdy!??");


        // PRIMITIVE DATA TYPE
        // los nombres son en minuscula

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 9999;
        long myLong = 666666666666L;

        float myFloat = 3.12343242f;
        double myDouble = 3.4444;
        boolean myBoolean = false;

        char myChar = 101;
        // tambien se puede poner el codigo en ascii   ie alt+ 124  para eñe

        //STRINGS
        //Cadenas de caractereres  (no es primitiva)  Nombres empiezan en mayuscula

        String myString = "Don't touch the moustache!";

        // System.out.println(myByte);
        System.out.println("myByte: " + myByte);
        System.out.println("myShot: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        System.out.println("myString: " + myString);

        myInt = 666;
        System.out.println("New myInt: " + myInt);


        // OPERATORS

        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);  // "Modulo" lo que sobra de la la division al usar numeros enteros


        //CONDITIONALS
        //if - else syntax
        number = 101;

        if (number == 0) {
            System.out.println("number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("number is larger than or equal to 100 and less or equal to 1000.");
        } else {
            System.out.println("number has another value");
        }


        if (number >= 10 || number <= -10) {
            System.out.println("The number has at least 2 digits");
        }

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        boolean myCondition = false;
        if (myCondition) System.out.println("The condition is true");
        else System.out.println("The condition is false");



        // switch case
        int day = 45;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Weekend");
                break;
        }

        int option = 1;


// CALLING METHODS
        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(1);

        System.out.println(info);


        //STRING Methods
        String address = "Fake Street, 1123";
        System.out.println("Address: " +address);
        System.out.println("Address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.replace("e","&"));

        //compare strings

        String address2 = "Fake Street, 11234";
        if (address.equals(address2)) System.out.println("They are the same address");
        else System.out.println("They are not the same address");

        System.out.println(info);


        //WRAPPERS  hace un objeto que se comporta como una variable primitiva

        Integer myNum = 111;
        System.out.println(myNum);
    }


    //Methods     aka funciones

    public static void myMethod() {
        System.out.println("This is my method");
        System.out.println("");
    }

    public static String getInfo (int option){
        if (option ==1 )  return "Dont touch the moustache";
        else if (option == 2) return "This is Java bootcamp";
        else return "Option " + option + " provides no info";
    }








    }

