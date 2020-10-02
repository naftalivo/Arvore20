
package seie.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HelpDesk-Seie
 */
@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length = 50,nullable = false,unique = true)
    private String nome;
    
    @Column(name = "data_nascimento",length = 20)
    private Date dataNascimento;
    
    @Column(name = "pin_acesso")
    private int pinAcesso;
    
    @Column(name = "nome_utilizador",nullable = false,length = 20)
    private String utilizador;
    
    
    @OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY)
    private List<Conta> contas = new ArrayList<>();
    
    @OneToMany(mappedBy = "cliente")
    private List<Movimentos> movimentos;

    public Cliente() {
    }

    public Cliente(String nome, Date dataNascimento, int pinAcesso, String utilizador) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.pinAcesso = pinAcesso;
        this.utilizador = utilizador;
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
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the pinAcesso
     */
    public int getPinAcesso() {
        return pinAcesso;
    }

    /**
     * @param pinAcesso the pinAcesso to set
     */
    public void setPinAcesso(int pinAcesso) {
        this.pinAcesso = pinAcesso;
    }

    /**
     * @return the utilizador
     */
    public String getUtilizador() {
        return utilizador;
    }

    /**
     * @param utilizador the utilizador to set
     */
    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * @return the contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * @return the movimentos
     */
    public List<Movimentos> getMovimentos() {
        return movimentos;
    }


   
    
}
