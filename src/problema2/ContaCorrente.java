package problema2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Esta classe oferece as funcionalidades básicas para atender ao Problema 2.
 */
/**
 *
 * @author marcel
 */
public class ContaCorrente implements Observer {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo = 0;
    private ArrayList<Operacao> operacoes = new ArrayList();
    private List<Servico> servicos = new ArrayList();

    public ContaCorrente(int numero, int agencia) {
        this.setNumero(numero);
        this.setAgencia(agencia);
    }

    public String getChave() {
        return String.valueOf(agencia) + "-" + String.valueOf(numero);
    }

    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para o saque");
        }
        Operacao oper = new Operacao(valor, this.getSaldo(), TipoOperacao.SAIDA, new Date(), this);
        operacoes.add(oper);
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        Operacao oper = new Operacao(valor, this.getSaldo(), TipoOperacao.ENTRADA, new Date(), this);
        operacoes.add(oper);
        this.saldo += valor;
    }

    public void transferir(double valor, ContaCorrente destino) {
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }
        destino.receberTransferencia(valor, this);
        Operacao oper = new OperacaoTransferencia(valor, this.getSaldo(), TipoOperacao.SAIDA, new Date(), this, destino);
        operacoes.add(oper);
        this.saldo -= valor;
    }

    private void receberTransferencia(double valor, ContaCorrente origem) {
        Operacao oper = new OperacaoTransferencia(valor, this.getSaldo(), TipoOperacao.ENTRADA, new Date(), this, origem);
        operacoes.add(oper);
        this.saldo += valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return this.getChave();
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(ArrayList<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    @Override
    public void addServico(Servico servico) {
        servicos.add(servico);
    }

    @Override
    public void executarServicos() {
        String str = "Cliente " + cliente + ", Conta " + getChave();
        if (!servicos.isEmpty()) {
            str += ", Serviços: \n";
            for (Servico servico : servicos) {
                str += servico.toString() + "\n";
            }
        } else {
            str += "\n Nenhum serviço para esta conta.";
        }
        System.out.println(str);
    }

    @Override
    public void removeServico(Servico servico) {
        servicos.remove(servico);
    }

}
