
package ejemplo1;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta

import java.util.Scanner;

public class Cuenta {
    
    private String Titular;
    private int Saldo;
    private boolean excento;
    public Scanner s = new Scanner(System.in);

    Cuenta(Cliente Nestor) {
        Titular = Nestor.nombre;
    }
    
    boolean CorrectContrasena(int x){
        int intentos = 0;
        while (true){
            if (intentos < 3){
                if (main.d==x){
                    return true;
                }
                else{
                    System.out.println("Contrasena Incorrecta, por favor digitela nuevamente");
                    x = s.nextInt();
                    intentos ++;
                }
            }
            else{
                System.out.println("Ha ingresado 3 veces su contraseña incorrecta. Su Cuenta será suspendida.");
                return false; 
            }
        }
    }
    
    double CuatroXmil(double y){
        y += y*0.004;
        return y;
    }

    boolean consignacion(int x){
        
        boolean peticion = true;
        
        if(peticion == true){
            Saldo = Saldo + x;
            System.out.println("Consignacion exitosa.");
            return true;
        }else{
            return false;
        }  
    }
    
    boolean retiro(int x){
        if (excento==true){
            if (x<=Saldo){
                System.out.println("Contando su dinero...");
                Saldo -= x;
                return true;
            }
            else{
                System.out.println("El valor introducido excede su Saldo actual.");
                return false;
            }
        }
        else{
            if (CuatroXmil(x)<=Saldo){
                System.out.println("Contando su dinero...");
                Saldo -= CuatroXmil(x);
                System.out.println("Retiere su dinero");
                return true;
            }
            else{
                System.out.println("El valor introducido excede su Saldo actual.");
                return false;
            }
        }
    }
    int getSaldo() {
        
        return this.Saldo;
    }
    
}
