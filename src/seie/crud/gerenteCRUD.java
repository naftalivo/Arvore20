package seie.crud;

import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.Session;
import org.hibernate.Transaction;
import seie.modelo.Agencia;
import seie.modelo.Caixa;
import seie.modelo.Gerente;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class gerenteCRUD implements FucoesBanco {

    Session sessao;
    Transaction transacao;

    @Override
    public Boolean salvar(Object objecto) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            sessao.save((Gerente) objecto);
            transacao.commit();
            sessao.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void alterar(Object objecto, Session s, Transaction t) {
    }

    @Override
    public void deletar(Object objecto, Session s, Transaction t) {
    }

    @Override
    public void buscar(Object objecto) {
    }

    public JComboBox preencherCombo(JComboBox c, Agencia agencia) {
        c.removeAllItems();
        c.addItem("Selecione");
        if (agencia.getCaixas().size() > 0) {
            agencia.getCaixas().stream().forEach((caix) -> {
                c.addItem(caix.getBalcao());
            });
        }

        return c;
    }

}
