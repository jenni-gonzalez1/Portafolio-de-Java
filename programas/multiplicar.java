package programas;

import java.util.Scanner;

public class multiplicar {

    public static void Multiplicacion() {

        Scanner Scannermulti = new Scanner(System.in);

        System.out.print("[n3]: ");
        double n1 = Scannermulti.nextDouble();

        System.out.print("[n2]: ");
        double n2 = Scannermulti.nextDouble();

        System.out.println("[Re]: " + (n1*n2));
        
    }
}