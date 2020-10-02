
package seie.crud;

import seie.modelo.Conta;
import seie.modelo.Movimentos;

/**
 *
 * @author HelpDesk-Seie
 */
public interface OperacoesBanco {
        
    public Boolean deposito(Conta conta,Movimentos mov);
    
    public Boolean saque(Conta conta,Movimentos mov);
    
    public void imprimirExtracto(Movimentos mov);
    
    public void transferencia(Movimentos mov);
    
    public void visualizarLog();
    
    
    
}
