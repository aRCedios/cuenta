package cuenta;

//aRCe
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.println("Hola, bienvenido al banco aRCe, desea crear una cuenta?");
        System.out.println("1. Para si");
        System.out.println("2. Para no");
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        switch(s){
            case 1 -> {
                System.out.println("Ingrese su nombre:");
                a.nextLine();
                String n = a.nextLine();
                Cliente n1 = new Cliente();
                n1.setNombre(n);
                System.out.println("Igrese su cedula: ");
                int c = a.nextInt();
                n1.setCedula(c);
                System.out.println("Ingrese una contraseña de 4 numeros para su cuenta: ");
                int d = a.nextInt();
                System.out.println("Ingrese la contraseña nuevamente: ");
                int e = a.nextInt();
                if(e==d){
                    Cuenta cuenta1 = new Cuenta(n1,d);
                    System.out.println("Contraseña guardada correctamente");
                    System.out.println("Su cuenta ha sido creada con exito, que desea hacer ahora?");
                    System.out.println("1. Consultar saldo ");
                    System.out.println("2. Ingresar dinero ");
                    System.out.println("3. Retirar dinero ");
                    System.out.println("4. Transferir");
                    System.out.println("5. Crear un CDT a 12% anual ");
                    System.out.println("6. Cambiar contrasena ");
                    System.out.println("7. Salir");

                    while(true){
                        int z = a.nextInt();
                        switch(z){
                            case 1 -> {
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("El saldo de su cuenta es: "+cuenta1.getSaldo());
                                
                                }
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
                            case 7->{
                                System.out.println("Adios.");
                                return;
                            }

                            default -> System.out.println("Ingrese una opcion valida.");
                        }
                        System.out.println("Desea hacer algo más? ");
                        System.out.println("1. Consultar saldo ");
                        System.out.println("2. Ingresar dinero ");
                        System.out.println("3. Retirar dinero ");
                        System.out.println("4. Transferir");
                        System.out.println("5. Crear un CDT a 12% anual ");
                        System.out.println("6. Cambiar contrasena ");
                        System.out.println("7. Salir");
                    }
                }
        
                else{
                    System.out.println("Las contraseñas no coinciden");
                    break;
                }
            }
            case 2 -> {
                System.out.println("2. No");
                System.out.println("Fin. ");
                break;
            }
            default -> System.out.println("Ingrese una opcion valida.");
        }

    }
}