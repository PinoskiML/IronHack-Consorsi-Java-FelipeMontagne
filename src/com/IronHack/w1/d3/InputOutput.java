package com.IronHack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        System.out.println("Normal console output");
        System.err.println("Error console output ie. in Red\n");  // serr


        //SCANNER CLASS

  /*      Scanner scanner = new Scanner(System.in);    // in desde consola


        String name;

        do {
            System.out.println("Name, bitte: ");
            name = scanner.nextLine();    // nextLine lee la siguiente linea que pase por sistema

        }while (name.length() <= 3);
        System.out.println("Tu nombre es: " + name);






        do {
            scanner = new Scanner(System.in);   //reinicializar
            System.out.println("Please write your age");

        } while (!scanner.hasNextInt());   //  mientras la entrada no tenga un Int

        int age = scanner.nextInt();
        System.out.println("Your age is: "+ age);

        scanner.close();   // Es buena practica cerrar scanner al terminar*/





        // FILE HANDLING

        String filePath = "src/com/IronHack/w1/d3/file.txt";
        FileWriter fileWriter = new FileWriter(filePath, true);

        fileWriter.write("This is a line\n");
        fileWriter.write("This is another line.\n");
        fileWriter.close();



        //Leer de un fichero

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        String str = "";

        while (fileScanner.hasNextLine()){
            str += fileScanner.nextLine() + "\n";

        }
        fileScanner.close();
        System.out.println(str);
        System.out.println("end ");

    }


}
