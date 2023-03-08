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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Giovanni Garrido
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "precioCompra", nullable = false)
    private float precioCompra;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idInventario", nullable = false)
    private Inventario inventario;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<EntradaAlmacen> entradasAlmacens;

    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(String nombre, String descripcion, float precioCompra, Categoria categoria, Inventario inventario, List<EntradaAlmacen> entradasAlmacens) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.categoria = categoria;
        this.inventario = inventario;
        this.entradasAlmacens = entradasAlmacens;
    }

    public Producto(Integer id, String nombre, String descripcion, float precioCompra, Categoria categoria, Inventario inventario, List<EntradaAlmacen> entradasAlmacens) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.categoria = categoria;
        this.inventario = inventario;
        this.entradasAlmacens = entradasAlmacens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<EntradaAlmacen> getEntradasAlmacens() {
        return entradasAlmacens;
    }

    public void setEntradasAlmacens(List<EntradaAlmacen> entradasAlmacens) {
        this.entradasAlmacens = entradasAlmacens;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    

}//end class
