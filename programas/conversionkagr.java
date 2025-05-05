package programas;

import java.util.Scanner;

public class conversionkagr {

    public static void conversionkagr() {

        Scanner scannConver = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en kilogramos: ");
        double kg = scannConver.nextDouble();

        double gramos = kg * 1000;

        System.out.println(kg + " kilogramos equivalen a " + gramos + " gramos.");

        
    }

    
}