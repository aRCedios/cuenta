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
                    System.out.println("5. Crear un CDT a 12% de interes simple anual ");
                    System.out.println("6. Cambiar contrasena ");
                    System.out.println("7. Certificación bancaria ");
                    System.out.println("8. Salir");

                    while(true){
                        int z = a.nextInt();
                        switch(z){
                            case 1 -> {
                                System.out.println("1. Consultar saldo ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("El saldo de su cuenta es: "+cuenta1.getSaldo());
                                
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            }
                            case 2 -> {
                                System.out.println("2. Ingresar dinero ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("Ingrese cuando dinero quiere meter a su cuenta: ");
                                    double ingreso = a.nextInt();
                                    double saldo = cuenta1.getSaldo();
                                    cuenta1.setSaldo(saldo+ingreso);
                                
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            }
                            case 3->{
                                System.out.println("3. Retirar dinero ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("Ingrese cuando dinero quiere sacar de su cuenta: ");
                                    double sacar = a.nextInt();
                                    double saldo = cuenta1.getSaldo();
                                    if(sacar<=saldo){
                                        cuenta1.setSaldo(saldo-sacar);
                                    }
                                    else{
                                        System.out.println("No tiene dinero suficiente jaja");
                                    }                                                                                                       
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            }
                            case 4->{
                                System.out.println("4. Transferir");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    double saldo = cuenta1.getSaldo();
                                    System.out.println("Cuantó dinero desea transferir? ");
                                    double trans = a.nextDouble();
                                    if(saldo>trans){
                                        cuenta1.setSaldo(saldo-trans);
                                    }
                                    else{
                                        System.out.println("Lo sentimos, no tiene suficiente dinero jaja");
                                    }
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            }
                            case 5->{
                                System.out.println("5. Crear un CDT a 12% de interes simple anual ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("Cuanto dinero desea ingresar al CDT? ");
                                    double cdti = a.nextDouble();
                                    if(cdti<cuenta1.getSaldo()){
                                        double cdtf = cdti*(1.12);
                                        System.out.println("Al completar el año se le ingresaran: "+cdtf+" a su cuenta. ");
                                        
                                        System.out.println("Ingrese '1' si quiere meter su dinero en el CDT O '0' si prefiere no hacerlo. ");
                                        String t = a.next();
                                        if("1".equals(t)){
                                            double saldo = cuenta1.getSaldo();
                                            cuenta1.setSaldo(saldo-cdti);
                                            double saldod = cuenta1.getSaldo();
                                            cuenta1.setSaldo(saldod+cdtf);
                                            System.out.println("Un año despues...");
                                            System.out.println("Su saldo es de : "+cuenta1.getSaldo());
                                        }
                                        else if("0".equals(t)){
                                            System.out.println("Bueno, adios");
                                        
                                        }
                                        else{
                                            System.out.println("Ingrese una opcion valida.");
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }

                            }
                            case 6->{
                                System.out.println("6. Cambiar contrasena ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("Ingrese la nueva contraseña: ");
                                    int g = a.nextInt();
                                    System.out.println("Ingrese contraseña nuevamente: ");
                                    int h = a.nextInt();
                                    if(g==h){
                                        cuenta1.setContraseña(g);
                                    }
                                    else{
                                        System.out.println("Las contraseñas no concuerdan, intentelo nuevamente");
                                    }                                
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            }
                            case 7->{
                                System.out.println("7. Certificación bancaria ");
                                System.out.println("Para confirmar su identidad y proteger su cuenta necesitamos que ingrese su cedula nuevamente: ");
                                int m = a.nextInt();
                                System.out.println("Ahora ingrese su contraseña: ");
                                int f = a.nextInt();
                                if(m==n1.getCedula() && f== cuenta1.getContraseña()){
                                    System.out.println("El banco aRCe notifica que: "+cuenta1.getTitular()+ " con cedula: "+n1.getCedula()+" tiene una cuenta activa en este banco.");
                                
                                }
                                else{
                                    System.out.println("Los datos no concuerdan con los de la cuenta...");
                                }
                            
                            }
                            case 8->{
                                System.out.println("8. Salir");
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
                        System.out.println("5. Crear un CDT a 12% de interes simple anual ");
                        System.out.println("6. Cambiar contrasena ");
                        System.out.println("7. Certificación bancaria ");
                        System.out.println("8. Salir");
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