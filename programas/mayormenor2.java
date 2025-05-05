package programas;

import java.util.Scanner;

public class mayormenor2 {

    public static void mayormenor2() {

        Scanner scannmayorymenor = new Scanner(System.in);

        // Entrada de los dos números
        System.out.print("[n1]: ");
        int n1 = scannmayorymenor.nextInt();

        System.out.print("[n2]: ");
        int n2 = scannmayorymenor.nextInt();

        // Comparaciones sin usar else
        if (n1 > n2) {
            System.out.println("Mayor: " + n1);
            System.out.println("Menor: " + n2);
        }

        if (n2 > n1) {
            System.out.println("Mayor: " + n2);
            System.out.println("Menor: " + n1);
        }

        if (n1 == n2) {
            System.out.println("[Re]: " + n1);
        }
        
    }
}