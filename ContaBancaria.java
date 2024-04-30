public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
