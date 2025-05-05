package programas;

import java.util.Scanner;

public class mayormenor3 {

    public static void mayormenor3() {

        Scanner scannerMyormenor3 = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        int num1 = scannerMyormenor3.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scannerMyormenor3.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scannerMyormenor3.nextInt();

        // Calcular el mayor
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Calcular el menor
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Mostrar resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        
    }

    
}