package cuenta;

//aRCe
public class Cuenta {
    private String Titular;
    private double Saldo;
    private int contraseña;

    Cuenta(Cliente n1,int contraseña) {
        Titular = n1.getNombre();
        this.contraseña = contraseña;
    }

    String getTitular(){
        return Titular;
    }
    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    public int getContraseña() {
        return contraseña;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    double getSaldo() {
        return this.Saldo;
    }
}