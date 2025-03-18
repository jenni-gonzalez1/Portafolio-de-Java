import java.util.Scanner;

public class portafolio {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do { 
            System.out.println("Bienvenidos a mi Jennifer java [Jennifer versión 1.0]");

            System.out.println("    _ _ __            ");
        System.out.println("    | | ___ _ __ _ __ (_)/ _| ___ _ __ ");
        System.out.println("_ | |/ _\\'_\\| '_\\| | |_ / _ \\ '__| ");
        System.out.println("| |_| | __/ | | | | | | | _| __/ |    ");
        System.out.println("\\___/ \\___|_| |_|_| |_|_|_| \\___|_|    ");
        System.out.println("");

        System.out.println("[?] Selecciona una opcion para continuar");
        System.out.println("Proyecto iniciado -----> Mar 18 8:48 am 2025");
        System.out.println("");
            
        //MENÚ
            System.out.println("[1] La suma de dos numeros");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[0l Salir");
            System.out.println("[?]");
            opcion = scanner.nextInt();

            //OPCIONES 
            switch (opcion) {
                case 1:
                    System.out.println("------------");
                    System.out.print("[n1]");
                    int n1 = scanner.nextInt();

                    break;
            
                default:
                    break;
            }
       
        } while (opcion !=0);
    }
}
