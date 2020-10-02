
package seie.crud;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import seie.modelo.Agencia;
import seie.modelo.Caixa;
import seie.modelo.Gerente;
import seie.modelo.Movimentos;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class AgenciaCRUD implements FucoesBanco{

    Session sessao; Transaction transacao;
    
    public List<Agencia> agencias() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<Agencia> agencias = sessao.createCriteria(Agencia.class).list();

        transacao.commit();
        sessao.close();

        return agencias;

    }

     
    
    @Override
    public Boolean salvar(Object objecto) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Agencia) objecto);
            transacao.commit();
            sessao.close();
            return true;
        } catch(Exception e){return false;}
    }

    @Override
    public void alterar(Object objecto, Session s, Transaction t) {}

    @Override
    public void deletar(Object objecto, Session s, Transaction t) {}
    @Override
    public void buscar(Object objecto) {}
    
    
    
}
