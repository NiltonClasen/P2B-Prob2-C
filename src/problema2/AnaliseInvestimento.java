package problema2;

public class AnaliseInvestimento extends Servico {

    public AnaliseInvestimento(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public String toString() {
        if (this.getConta().getOperacoes().get(this.getConta().getOperacoes().size() - 1).getTipo() == TipoOperacao.ENTRADA) {
            return "-Análise de Investimento";
        }
        return "";
    }

}
