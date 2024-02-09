public class Cuenta {
    private String numero;
    private float saldo;
    public Cuenta(String numCta, float saldoCta){
        numero = numCta;
        saldo = saldoCta;
        //gittttt
    }
    public String getNumero(){
        return numero;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setNumero(String numCta){
        numero = numCta;
    }
    public void setSaldo(float saldoCta){
        saldo = saldoCta;
    }
    public void ingresarDinero(float importe){
        saldo = saldo + importe;
    }
    public void extraerDinero(float importe){
        saldo = saldo - importe;
    }
    public void mostrarCuenta(){
        System.out.println("Nº de cuenta: "+ getNumero());
        System.out.println("Saldo: "+ getSaldo() + " €");
    }
}