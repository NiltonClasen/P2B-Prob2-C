/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author bruno
 */
public class Notificacao extends Servico{
    TipoNotificacao tipo;
    
    public Notificacao(ContaCorrente conta, TipoNotificacao tipo) {
        super(conta);
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        //pega a ultima operacao da conta
        return "Notificação " + tipo + ": Conta Corrente " + this.getConta() + " Operação: " + this.getConta().getOperacoes().get(this.getConta().getOperacoes().size()-1);
    
    }
    
}
