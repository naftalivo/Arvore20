
package seie.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author HelpDesk-Seie
 */

@Entity
public class Caixa extends Funcionario{
    
//    @Id
//    @GeneratedValue
//    @Column(name = "id_caixa")
//    private int codigo;
//    
    private int balcao;
    
    @Column(scale = 2)
    private double salario;
    
    @Column(scale = 2)
    private double bonus;
    
    @Column(name = "valor_total_bonus",scale = 2)
    private double valorBonus;
    
    @Column(name = "valor_total",scale = 2)
    private double valorTotal;
    
    @Column(name = "qtd_depositos",scale = 2)
    private int qtdDepositos;
    
    @OneToOne(mappedBy = "caixa")    
    private Login login;
    
    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;
    
    @OneToMany(mappedBy = "caixa")
    private List<Movimentos> movimentos = new ArrayList<>();

    public Caixa() {
    }

    public Caixa( String nome, Date dataIngresso,int balcao, double salario, double bonus,Agencia agencia) {
        super(nome, dataIngresso);
        this.balcao = balcao;
        this.salario = salario;
        this.bonus = bonus;
        this.agencia = agencia;
        
        
    }


    /**
     * @return the balcao
     */
    public int getBalcao() {
        return balcao;
    }

    /**
     * @param balcao the balcao to set
     */
    public void setBalcao(int balcao) {
        this.balcao = balcao;
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

    /**
     * @return the valorBonus
     */
    public double getValorBonus() {
        this.valorBonus = (salario*((bonus)/100)) * getQtdDepositos();
        System.out.println("Valor de Bónus:  "+valorBonus);
        return valorBonus;
    }

    /**
     * @return the qtdDepositos
     */
    public int getQtdDepositos() {
        return qtdDepositos;
    }

    /**
     * @param qtdDepositos the qtdDepositos to set
     */
    public void setQtdDepositos() {
        ++this.qtdDepositos;
        
        getValorBonus();
        getValorTotal();
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        valorTotal = getSalario() + getValorBonus();
        return valorTotal;
    }

    /**
     * @return the movimentos
     */
    public List<Movimentos> getMovimentos() {
        return movimentos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Movimentos m : movimentos) {
             sb.append("Tipo de Movimento: "+m.getTipo()+"\n"
                    + "Data: "+m.getData()+"\n\n");
        }
        return sb.toString();
    }
    
    
}
