
package problema2;


public class AnaliseFluxoCaixa extends Servico {

    public AnaliseFluxoCaixa(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public String toString() {
        String str = "-Análise fluxo de caixa: \n";
        if(!this.getConta().getOperacoes().isEmpty())
            for (Operacao o : this.getConta().getOperacoes()) {
                str += "-" + o.toString() + "\n";
            }
        return str;
    }

}
