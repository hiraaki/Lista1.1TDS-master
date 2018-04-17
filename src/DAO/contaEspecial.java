package DAO;

public class contaEspecial extends Conta{
    private float limite;

    public contaEspecial(String cliente, int numero, float saldo, float limite) {
        super(cliente, numero, saldo);
        this.limite = limite;
    }



    @Override
    public void sacar(float saque){
        if((this.getSaldo()+this.limite)<saque)
            System.out.println("Voce n�o possui limite suficiente");
        else
            this.setSaldo(this.getSaldo()-saque);
    }
}
