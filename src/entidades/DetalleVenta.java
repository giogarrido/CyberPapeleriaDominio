package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Giovanni Garrido
 */

@Entity
@Table(name = "detalleVentas")

public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precioVendido")
    private float precioVendido;

    @Column(name = "importe")
    private float importe;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVenta", nullable = false)
    private Venta venta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idInventario", nullable = false)
    private Inventario inventario;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id) {
        this.id = id;
    }

    public DetalleVenta(int cantidad, float precioVendido, float importe, Venta venta, Inventario inventario) {
        this.cantidad = cantidad;
        this.precioVendido = precioVendido;
        this.importe = importe;
        this.venta = venta;
        this.inventario = inventario;
    }

    public DetalleVenta(Integer id, int cantidad, float precioVendido, float importe, Venta venta, Inventario inventario) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioVendido = precioVendido;
        this.importe = importe;
        this.venta = venta;
        this.inventario = inventario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioVendido() {
        return precioVendido;
    }

    public void setPrecioVendido(float precioVendido) {
        this.precioVendido = precioVendido;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final DetalleVenta other = (DetalleVenta) obj;
        return Objects.equals(this.id, other.id);
    }

   
    

}
