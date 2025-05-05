package programas;

import java.util.Scanner;

public class modulo { 

    public static void modulo() {

        Scanner scannModulo = new Scanner(System.in);

        System.out.print("[n1]: ");
        int n1 = scannModulo.nextInt();

        System.out.print("[n2]: ");
        int n2 = scannModulo.nextInt();

        int residuo = n1 % n2;

        System.out.println("El residuo de la division es de" + n1 + n2 + residuo);

    }

    
}