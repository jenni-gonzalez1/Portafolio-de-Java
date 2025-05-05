import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        
        do { 
            
        vistas.vista.banner();
        programas.Opciones.Opciones();
        System.out.println("[0] salir");
        System.out.print("[?]");

        opcion = scanner.nextInt();
        
            //OPCIONES 
            switch (opcion) {
                case 1:
                    programas.sumar.suma();

                    break;
                
                case 2:
                    programas.restar.resta();

                    break;
                    
                case 3:
                    programas.multiplicar.Multiplicacion();

                    break;

                case 4:
                    programas.division.Division();

                    break;

                case 5:
                    programas.modulo.modulo();

                    break;

                case 6:
                    programas.promedio.Promedio();

                    break;

                case 7:
                    programas.mayormenor2.mayormenor2();

                    break;

                case 8:
                    programas.mayormenor3.mayormenor3();

                    break;

                case 9:
                    programas.Conversionmacm.Conversionmacm();

                    break;

                case 10:
                    programas.conversionkagr.conversionkagr();

                    break;
                
                case 0:
                    System.out.println("Saliendo del programa");

                default: System.out.println("Opcion no valida");
                    break;
            }
       
        } while (opcion !=0);
    }
}
