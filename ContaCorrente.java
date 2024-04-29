public class ContaCorrente extends ContaBancaria {
    private doule taxamanutençao;
    
    public ContaCorrente(string numerodaconta, double taxamanutençao) {
        super(numerodaconta);
        this.taxamanutençao = taxamanutençao;
    }
      
    public double calcularTaxaManutençao(){
        return taxamanutençao;
    }
}
