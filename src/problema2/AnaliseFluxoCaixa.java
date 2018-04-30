/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Date;

/**
 *
 * @author casa
 */
public class AnaliseFluxoCaixa extends Servico {

    public AnaliseFluxoCaixa(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public String toString() {
        
        String str = "Análise de fluxo de caixa: ";
        
        if(!this.getConta().getOperacoes().isEmpty())
            for (Operacao o : this.getConta().getOperacoes()) {
                str += o.toString() + "\n";
            }
        return str;
    }

}
