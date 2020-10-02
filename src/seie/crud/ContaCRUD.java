
package seie.crud;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import seie.modelo.Agencia;
import seie.modelo.Caixa;
import seie.modelo.Conta;
import seie.modelo.Gerente;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class ContaCRUD implements FucoesBanco{

    Session sessao; Transaction transacao;
    
    public List<Conta> contas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<Conta> contas = sessao.createCriteria(Conta.class).list();

        transacao.commit();
        sessao.close();

        return contas;

    }
    
     public List<Conta> contasPorCliente() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

//        List<Conta> contas = sessao.get(Conta.class, Conta.class);

        transacao.commit();
        sessao.close();

        return null;

    }

    
    @Override
    public Boolean salvar(Object objecto) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Conta) objecto);
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
