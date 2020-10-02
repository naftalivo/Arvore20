
package seie.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HelpDesk-Seie
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Funcionario {
    
    @Id
    @GeneratedValue
    @Column(name = "id_funcionario")
    private int codigo;
    
    @Column(name = "nome_funcionario",length = 50,nullable = false,unique = true)
    private String nome;
    
    @Temporal(TemporalType.DATE)
    private Date dataIngresso;

    public Funcionario() {
    }

    public Funcionario(String nome, Date dataIngresso) {
        this.nome = nome;
        this.dataIngresso = dataIngresso;
    }
    
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataIngresso
     */
    public Date getDataIngresso() {
        return dataIngresso;
    }

    /**
     * @param dataIngresso a dataIngresso que deseja armazenar
     */
    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
    
    
    
    
}
