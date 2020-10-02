
package seie.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HelpDesk-Seie
 */
public interface FucoesBanco {
    
    public Boolean salvar(Object objecto);
    public void alterar(Object objecto,Session s,Transaction t);
    public void deletar(Object objecto,Session s,Transaction t);
    public void buscar(Object objecto);
    
    
}
