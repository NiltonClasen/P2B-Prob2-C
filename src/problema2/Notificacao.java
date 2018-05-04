package problema2;


public class Notificacao extends Servico {

    TipoNotificacao tipo;

    public Notificacao(ContaCorrente conta, TipoNotificacao tipo) {
        super(conta);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        //pega a ultima operacao da conta
        String str = "-Notificação " + tipo + ": \n" + this.getConta().getOperacoes().get(this.getConta().getOperacoes().size() - 1) + "\n";
        if (tipo == TipoNotificacao.JMS) {
            ClientePessoaJuridica c = (ClientePessoaJuridica)this.getConta().getCliente();
            return str + "Servidor JMS: " + c.getServidorJMS();

        } else {
            return str;
        }

    }

}
