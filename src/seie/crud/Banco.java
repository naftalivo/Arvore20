package seie.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import seie.modelo.Conta;
import seie.modelo.Movimentos;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class Banco implements OperacoesBanco {

    Session sessao;
    Transaction transacao;
    

    @Override
    public Boolean deposito(Conta conta,Movimentos mov) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.update(conta);

            sessao.save(mov);

            transacao.commit();
            sessao.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean saque(Conta conta,Movimentos mov) {

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.update(conta);

            sessao.save(mov);
            
            transacao.commit();
            sessao.close();
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    
    @Override
    public void visualizarLog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirExtracto(Movimentos mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferencia(Movimentos mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
