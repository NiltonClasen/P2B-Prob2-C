/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author casa
 */
public class BaixaAutomatica extends Servico{
    

    public BaixaAutomatica(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public String toString() {
        
        return "Conta " + this.getConta().getChave() + ": Operação de Baixa automatica. ";

    }

}
