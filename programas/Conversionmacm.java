package programas;

import java.util.Scanner;

public class Conversionmacm {

    public static void Conversionmacm() {

        Scanner scannconver = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en metros: ");
        double metros = scannconver.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros equivalen a " + centimetros + " centímetros.");

    }

    
}