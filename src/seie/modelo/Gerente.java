
package seie.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author HelpDesk-Seie
 */

@Entity
public class Gerente extends Funcionario{
    
//    @Id
//    @GeneratedValue
//    private int codigo;
  
    @Column(scale = 2)
    private double salario;
    
    @Column(scale = 2)
    private double bonus;
    
    @OneToOne(mappedBy = "gerente")
    private Login login;

    @OneToOne(mappedBy = "gerente")
    private Agencia agencia;

    public Gerente() {
    }

    public Gerente(String nome, Date dataIngresso,double salario, double bonus) {
        super(nome, dataIngresso);
        this.salario = salario;
        this.bonus = bonus;

    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the agencia
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    
    
    
}
