package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Giovanni Garrido
 */
@Entity
@Table(name = "inventarios")

public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidadExistencia")
    private Integer cantidadExistencia;

    @Column(name = "precioVenta")
    private float precioVenta;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventario")
    private List<DetalleVenta> detalleVentas ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventario")
    private List<EntradaAlmacen> entradasAlmacen;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventario")
    private List<Producto> productos;

    public Inventario() {
    }

    public Inventario(Integer cantidadExistencia, float precioVenta, List<DetalleVenta> detalleVentas, List<EntradaAlmacen> entradasAlmacen, List<Producto> productos) {
        this.cantidadExistencia = cantidadExistencia;
        this.precioVenta = precioVenta;
        this.detalleVentas = detalleVentas;
        this.entradasAlmacen = entradasAlmacen;
        this.productos = productos;
    }

    public Inventario(Integer id, Integer cantidadExistencia, float precioVenta, List<DetalleVenta> detalleVentas, List<EntradaAlmacen> entradasAlmacen, List<Producto> productos) {
        this.id = id;
        this.cantidadExistencia = cantidadExistencia;
        this.precioVenta = precioVenta;
        this.detalleVentas = detalleVentas;
        this.entradasAlmacen = entradasAlmacen;
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(Integer cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public List<EntradaAlmacen> getEntradasAlmacen() {
        return entradasAlmacen;
    }

    public void setEntradasAlmacen(List<EntradaAlmacen> entradasAlmacen) {
        this.entradasAlmacen = entradasAlmacen;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Inventario other = (Inventario) obj;
        return Objects.equals(this.id, other.id);
    }

 
}
