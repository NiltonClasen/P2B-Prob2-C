/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import org.junit.Test;

/**
 *
 * @author bruno
 */
public class ContaCorrenteTest {
   

    /**
     * Test of getOperacoes method, of class ContaCorrente.
     */
    @Test
    public void testServicos() {
        
        Cliente c = new ClientePessoaFisica("Carol", "4999999", "4999999", "11085961931"); 
        ContaCorrente conta = new ContaCorrente(1010,123456);
        ContaCorrente conta2 = new ContaCorrente(202020,666666);
        c.addConta(conta);
        c.addConta(conta2);
        conta.addServico(new AnaliseFluxoCaixa(conta));
        conta.addServico(new BaixaAutomatica(conta));
        conta.addServico(new Notificacao(conta, TipoNotificacao.SMS));
        conta.depositar(10);
        conta.sacar(5);
        conta.transferir(2, conta2);
        
        
     }
    
}
