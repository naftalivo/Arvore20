package seie.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author HelpDesk-Seie
 */
@Entity
@Table(name = "agencias")
public class Agencia {

    @Id
    @GeneratedValue
    @Column(name = "id_agencia")
    private int codigo;

    @Column(nullable = false,length = 30,unique = true)
    private String nome;

    @Column(nullable = true,length = 20,unique = false)
    private String contacto;

    @Column(nullable = true,length = 50,unique = false)
    private String endereco;

    @OneToMany(mappedBy = "agencia")
    private List<Conta> contas = new ArrayList<>();
    
    @OneToMany(mappedBy = "agencia")
    private List<Caixa> caixas = new ArrayList<>();
    
    
    @OneToMany(mappedBy = "agencia",fetch = FetchType.LAZY)
    private List<Movimentos> movimentos = new ArrayList<>();
    
    @OneToOne
    @JoinColumn(name = "id_gerente")
    private Gerente gerente;

    public Agencia() {
    }

    public Agencia(String nome, String contacto, String endereco,Gerente gerente) {
        this.nome = nome;
        this.contacto = contacto;
        this.endereco = endereco;
        this.gerente = gerente;
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
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    /**
     * @return the caixas
     */
    public List<Caixa> getCaixas() {
        return caixas;
    }

    /**
     * @param caixas the caixas to set
     */
    public void setCaixas(List<Caixa> caixas) {
        this.caixas = caixas;
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

    /**
     * @return the movimentos
     */
    public List<Movimentos> getMovimentos() {
        return movimentos;
    }
    
   
    
    
    
    
}
