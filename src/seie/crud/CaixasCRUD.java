package seie.crud;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import seie.modelo.Agencia;
import seie.modelo.Caixa;
import seie.modelo.Gerente;
import seie.modelo.Movimentos;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class CaixasCRUD implements FucoesBanco {

    Session sessao;
    Transaction transacao;

    public List<Caixa> caixas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<Caixa> caixas = sessao.createCriteria(Caixa.class).list();

        transacao.commit();
        sessao.close();

        return caixas;

    }
    
    public List<Caixa> caixasNaAgencia(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Caixa> caixas = sessao.createCriteria(Caixa.class).add(Restrictions.eq("agencia", id)).list();

        transacao.commit();
        sessao.close();

        return caixas;

    }

    public String toString(Agencia a){
        StringBuilder sb = new StringBuilder();
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tra = s.beginTransaction();
        
        Agencia aa =(Agencia) s.get(Agencia.class, a.getCodigo());
              
        tra.commit();
        s.close();
        
        for (Movimentos m : aa.getMovimentos()) {
             sb.append("Tipo de Movimento: "+m.getTipo()+"\n"
                    + "Data: "+m.getData()+"\n\n");
        }
        return sb.toString();
    }
    
    @Override
    public Boolean salvar(Object objecto) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Caixa) objecto);
            transacao.commit();
            sessao.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void alterar(Caixa objecto) {

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.update(objecto);
            transacao.commit();
            sessao.close();

        } catch (Exception e) {
        }

    }

    @Override
    public void deletar(Object objecto, Session s, Transaction t) {
    }

    @Override
    public void buscar(Object objecto) {
    }

    @Override
    public void alterar(Object objecto, Session s, Transaction t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
