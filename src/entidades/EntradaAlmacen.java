
package entidades;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Giovanni Garrido
 */

@Entity
@Table(name = "entradasAlmacen")

public class EntradaAlmacen implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   
    
    @Column(name = "fechaEntrada", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaEntrada;
    
    @Column(name = "cantidadComprada", nullable = false)
    private Integer cantidadComprada;
    
    @Column(name = "precioCompra", nullable = false)
    private float precioCompra;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProvedor", nullable = false)
    private Proveedor proveedor;
    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    public EntradaAlmacen() {
    }

    public EntradaAlmacen(Integer id) {
        this.id = id;
    }

    public EntradaAlmacen(Calendar fechaEntrada, Integer cantidadComprada, float precioCompra, Proveedor proveedor, Producto producto) {
        this.fechaEntrada = fechaEntrada;
        this.cantidadComprada = cantidadComprada;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
        this.producto = producto;
    }

    public EntradaAlmacen(Integer id, Calendar fechaEntrada, Integer cantidadComprada, float precioCompra, Proveedor proveedor, Producto producto) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.cantidadComprada = cantidadComprada;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Integer getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(Integer cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final EntradaAlmacen other = (EntradaAlmacen) obj;
        return Objects.equals(this.id, other.id);
    }
   
    
    
}//end class
