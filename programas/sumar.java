package programas;

import java.util.Scanner;

public class sumar {

    public static void suma() {

        Scanner scannumeros = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannumeros.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannumeros.nextDouble();

        System.out.print("[Re]: " + (n1+n2));
        
    }

    
}