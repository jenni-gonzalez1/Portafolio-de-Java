package programas;

import java.util.Scanner;

public class division {

    public static void Division() {

        Scanner scannerDiv = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannerDiv.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannerDiv.nextDouble();

        System.out.println("[Re]: " + (n1/n2));
        
    }
}