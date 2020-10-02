
package seie.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author HelpDesk-Seie
 */

@Entity
@Table(name = "logins")
public class Login {
    
    @Id
    @GeneratedValue
    @Column(name = "id_login")
    private int codigo;
    
    @Column(name = "nome_login",nullable = false,unique = true,length = 20)
    private String nome;
    
    @Column(name = "senha_login",nullable = false,unique = false,length = 20)
    private String senha;
    
    @OneToOne
    @JoinColumn(name = "id_caixa")
    private Caixa caixa;
    
    @OneToOne
    @JoinColumn(name = "id_gerente")
    private Gerente gerente;
    
    public Login() {
    }

    public Login(String nome, String senha, Caixa caixa) {
        this.nome = nome;
        this.senha = senha;
        this.caixa = caixa;
    }
    public Login(String nome, String senha,Gerente gerente) {
        this.nome = nome;
        this.senha = senha;
        this.gerente = gerente;
    }
    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the caixa
     */
    public Caixa getCaixa() {
        return caixa;
    }

    /**
     * @param caixa the caixa to set
     */
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    /**
     * @return the gerente
     */
    public Gerente getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
  
    
    
    
}
