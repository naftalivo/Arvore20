
package seie.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HelpDesk-Seie
 */
@Entity
@Table(name = "contas")
public class Conta {
    
    @Id
    @GeneratedValue
    @Column(name = "id_conta")
    private int id;
    
    private Long numero;
    
    @Column(scale = 2)
    private double saldo;
    
    @Column(nullable = false,length = 20)
    private String tipo;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;
    
    @OneToMany(mappedBy = "conta",fetch = FetchType.LAZY)
    private List<Movimentos> movimentos = new ArrayList<>();

    public Conta() {
    }

    public Conta(int id, Long numero, double saldo, String tipo, Cliente cliente, Agencia agencia) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
        this.agencia = agencia;
    }   
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
     * @return the movimentos
     */
    public List<Movimentos> getMovimentos() {
        return movimentos;
    }
    
    
    
}
