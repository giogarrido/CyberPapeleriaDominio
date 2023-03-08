package entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Giovanni Garrido
 */
@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column (name = "numTicket", nullable = false)
    private Integer numTicket;

    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fecha;

    @Column(name = "totalventa", nullable = false)
    private float totalventa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "venta")
    private List<DetalleVenta> detalleVentas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCaja", nullable = false)
    private Caja caja;

    public Venta() {
    }

    public Venta(Integer id) {
        this.id = id;
    }

    public Venta(Integer numTicket, Calendar fecha, float totalventa, Cliente cliente, List<DetalleVenta> detalleVentas, Caja caja) {
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.totalventa = totalventa;
        this.cliente = cliente;
        this.detalleVentas = detalleVentas;
        this.caja = caja;
    }

    public Venta(Integer id, Integer numTicket, Calendar fecha, float totalventa, Cliente cliente, List<DetalleVenta> detalleVentas, Caja caja) {
        this.id = id;
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.totalventa = totalventa;
        this.cliente = cliente;
        this.detalleVentas = detalleVentas;
        this.caja = caja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(Integer numTicket) {
        this.numTicket = numTicket;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(float totalventa) {
        this.totalventa = totalventa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return numTicket.toString();
    }



    

}
