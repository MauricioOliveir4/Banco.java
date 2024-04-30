public class ContaPoupanca  extends ContaBancaria {
    private double taxaRendimento;
    private double limiteChequeEspecial;
    
    public ContaPoupanca(string numeroConta, double taxaRendimento. double limiteChequeEspecial){
        super(numeroConta);
        this.taxaRendimento = taxaRendimento;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
     public double calcularRendimento() {
         return getSaldo() * taxaRendimento;
     }
     
     public double getMontante() sacarChequeEspecial(double valor){
         if (valor <=limiteChequeEspecial) {
             sacar(valor);
         }
     }
     
}
