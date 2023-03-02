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
@Table(name = "detalle_ventas")

public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precioventa")
    private float precioventa;

    @Column(name = "importe")
    private float importe;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto producto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idventa", nullable = false)
    private Venta venta;

    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, float precioventa, float importe, Producto producto) {
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.importe = importe;
        this.producto = producto;
    }

    public DetalleVenta(int cantidad, float precioventa, float importe, Producto producto, Venta venta) {
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.importe = importe;
        this.producto = producto;
        this.venta = venta;
    }

    public DetalleVenta(Integer id, int cantidad, float precioventa, float importe, Producto producto, Venta venta) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.importe = importe;
        this.producto = producto;
        this.venta = venta;
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

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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

    @Override
    public String toString() {
        return "DetalleVenta{" + "id=" + id + ", cantidad=" + cantidad + ", precioventa=" + precioventa + ", importe=" + importe + ", producto=" + producto + ", venta=" + venta + '}';
    }
    
    
    
    

}
