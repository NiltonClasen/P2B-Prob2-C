package problema2;

public class OfertaFinanciamento extends Servico {

    public OfertaFinanciamento(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public String toString() {
        if (this.getConta().getOperacoes().get(this.getConta().getOperacoes().size() - 1).getTipo() == TipoOperacao.SAIDA) {
            return "-Oferta de financiamento";
        }

        return "";
    }

}
