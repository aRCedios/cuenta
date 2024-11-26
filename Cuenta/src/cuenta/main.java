package cuenta;
//aRCe
import java.util.*;
public class main {
        public static void main(String[] args) {
        System.out.println("Hola, bienvenido al banco aRCe, desea crear una cuenta?");
        System.out.println("1. Para si");
        System.out.println("2. Para no");
        while(true){
            Scanner a = new Scanner(System.in);
            int s = a.nextInt();
            switch(s){
                case 1 -> {
                    System.out.println("Ingrese su nombre");
                    String n = a.nextLine();
                    Cliente n1 = new Cliente();
                    n1.setNombre(n);
                    Cuenta cuenta1 = new Cuenta(n1);
                    System.out.println("Que desea hacer con su cuenta?");
                    System.out.println("1. Consultar saldo ");
                    System.out.println("2. Ingresar dinero ");
                    System.out.println("3. Retirar dinero ");
                    System.out.println("4. Transferir");
                    System.out.println("5. Crear un CDT a 12% anual ");
                    System.out.println("6. Cambiar contrasena ");                    
                    Scanner b = new Scanner(System.in);
                    int z = a.nextInt();
                    switch(s){
                        case 1 -> {
                            
                        
                        }
                        case 2 -> {
                        }
                        case 3->{
                    
                        }
                        case 4->{
                    
                        }
                        case 5->{
                    
                        }
                        case 6->{
                    
                        }
                    
                        default -> System.out.println("Ingrese una opcion valida.");
                    }
                }
                case 2 -> {
                    System.out.println("2. No");
                    System.out.println("Fin. ");
                    return;
                }
                default -> System.out.println("Ingrese una opcion valida.");
            }
            System.out.println("Siguiente opcion: ");
        }
    }
}
