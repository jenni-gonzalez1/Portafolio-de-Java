package programas;

import java.util.Scanner;

public class promedio {

    public static void Promedio() {

        Scanner scannPromedio = new Scanner(System.in);

        System.out.print("[1]: ");            
        double n1= scannPromedio.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannPromedio.nextDouble();

        System.out.print("[n3]: ");
        double n3 = scannPromedio.nextDouble();

        System.out.println("[Re]: " + ( (n1 + n2 + n3) /3));


        
    }

    
}