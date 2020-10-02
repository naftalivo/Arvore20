
package seie.crud;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import seie.modelo.Caixa;
import seie.modelo.Cliente;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class ClienteCRUD implements FucoesBanco{

    Session sessao; Transaction transacao;
    
    public List<Cliente> clientes() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<Cliente> clientes = sessao.createCriteria(Cliente.class).list();

        transacao.commit();
        sessao.close();

        return clientes;

    }

    public List<Caixa> clientesNaAgencia(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Caixa> caixas = sessao.createCriteria(Caixa.class).add(Restrictions.eq("agencia", id)).list();

        transacao.commit();
        sessao.close();

        return caixas;

    }
    
    
    @Override
    public Boolean salvar(Object objecto) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Cliente) objecto);
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
