package programas;

import java.util.Scanner;

public class restar {

    public static void resta() {

        Scanner scanerNumero = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scanerNumero.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scanerNumero.nextDouble();

        System.out.println("[Re]: " + (n1-n2));
        
    }

    
}