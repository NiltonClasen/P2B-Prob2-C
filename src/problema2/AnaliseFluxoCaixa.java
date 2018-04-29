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
public class AnaliseFluxoCaixa {
    
    public String toString(ContaCorrente conta){
        String str = "";
        for(Operacao o : conta.getOperacoes()){
            str += o.toString()+"\n";
        }
        return str;
    }
    
    
}
