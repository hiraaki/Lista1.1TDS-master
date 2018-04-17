package DAO;

public class Conta implements Comparable<Conta>{
    private  String cliente;
    private int  numero;
    private float saldo;

    public Conta() {
    }

    public Conta(String cliente, int numero, float saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void sacar(float saque){
        if((this.saldo-saque)<0){
            System.out.println("Saldo Insuficiente");
        }else{
            this.saldo-=saque;
        }
    }
    public void deposito(float deposito){
        this.saldo+=deposito;
    }

    @Override
    public int compareTo(Conta i2) {
        if((this.numero-i2.numero)>0)
            return 1;
        else if((this.numero-i2.numero)<0)
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente='" + cliente + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
