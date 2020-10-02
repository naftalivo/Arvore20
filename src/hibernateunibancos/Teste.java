/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateunibancos;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author HelpDesk-Seie
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transation = session.beginTransaction();
        
        transation.commit();
        session.close();
        System.exit(0);
        
    }
    
}
