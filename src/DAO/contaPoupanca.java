package DAO;

public class contaPoupanca extends Conta {
    private int diaRendimento;

    public contaPoupanca(String cliente, int numero, float saldo, int diaRendimento) {
        super(cliente, numero, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float rendimento){
        this.setSaldo(
                this.getSaldo()+(this.getSaldo()*(rendimento/100))
        );
    }
}
