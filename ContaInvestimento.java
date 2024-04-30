public class contaInvestimento extends contaBancaria {
    private double taxaRendimento;
    
    public contaInvestimento (string numeroconta, double taxaRendimento){
        super(numeroconta);
        this.taxaRendimento = taxaRendimento;
    }
    
    publuc double calcularRendimento(){
        return getSaldo * taxaRendimento;
    }
}
