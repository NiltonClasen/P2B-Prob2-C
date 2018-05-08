/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author daniel
 */
public interface Observer {
    public void addServico(Servico servico);
    public void removeServico(Servico servico);
    public void executarServicos();
}
