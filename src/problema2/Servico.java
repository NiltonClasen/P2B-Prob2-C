package problema2;

public class Servico {
   
    private ContaCorrente conta;

    public Servico(ContaCorrente conta) {
        this.conta = conta;
    }
    public ContaCorrente getConta() {
        return conta;
    }
}
