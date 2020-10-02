
package seie.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HelpDesk-Seie
 */
@Entity
@Table(name = "movimentos")
public class Movimentos {
    
    @Id
    @GeneratedValue
    
    private int id;
    
    @Column(name = "tipo",length = 20,nullable = false)
    private String tipo;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Temporal(TemporalType.TIME)
    private Date hora;
    
    @Column(name = "valor_entrada",scale = 2)
    private double valorEntrada;
    
    @Column(name = "valor_saida",scale = 2)
    private double valorSaida;
    
    @Column(name = "valor_actual",scale = 2)
    private double valorActual;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;
    
    @ManyToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;
    
    @ManyToOne
    @JoinColumn(name = "id_caixa")
    private Caixa caixa;

    public Movimentos() {
    }

    public Movimentos(String tipo, Date data, Date hora, double valorEntrada, double valorSaida, double valorActual, Cliente cliente, Agencia agencia, Conta conta, Caixa caixa) {
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;
        this.valorActual = valorActual;
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        this.caixa = caixa;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the valorEntrada
     */
    public double getValorEntrada() {
        return valorEntrada;
    }

    /**
     * @param valorEntrada the valorEntrada to set
     */
    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    /**
     * @return the valorSaida
     */
    public double getValorSaida() {
        return valorSaida;
    }

    /**
     * @param valorSaida the valorSaida to set
     */
    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    /**
     * @return the valorActual
     */
    public double getValorActual() {
        return valorActual;
    }

    /**
     * @param valorActual the valorActual to set
     */
    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
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
     * @return the conta
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Conta conta) {
        this.conta = conta;
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
    
    public String toString(){
        return "Tipo de Movimento: "+this.tipo+"\n"
                + "Valor Depositado: "+this.valorEntrada+"\n"
                + "Valor  Levantado: "+this.valorSaida+"\n"
                + "Saldo disponível: "+this.valorActual+"\n"
                + "Data: "+this.data+"\nHora: "+this.hora+"\n"
                + "-----------------**********----------------\n\n";
    }
    
    
}
