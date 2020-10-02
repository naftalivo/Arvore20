package seie.crud;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import seie.modelo.Login;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class loginCRUD implements FucoesBanco {

    Session sessao;
    Transaction transacao;

    
    public List<Login> logins() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<Login> logins = sessao.createCriteria(Login.class).list();

        transacao.commit();
        sessao.close();
        
        return logins;

    }
    
    @Override
    public Boolean salvar(Object objecto) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Login) objecto);
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
