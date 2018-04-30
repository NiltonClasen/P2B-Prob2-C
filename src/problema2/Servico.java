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
public class Servico {
   
    private ContaCorrente conta;

    public Servico(ContaCorrente conta) {
        this.conta = conta;
    }
    public ContaCorrente getConta() {
        return conta;
    }
}
