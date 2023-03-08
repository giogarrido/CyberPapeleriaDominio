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
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "website", length = 50)
    private String website;

    @Column(name = "contacto", nullable = false, length = 100)
    private String contacto;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "proveedor")
    private List<EntradaAlmacen> entradasAlmacen;

    public Proveedor() {
    }

    public Proveedor(Integer id) {
        this.id = id;
    }

    public Proveedor(String nombre, String direccion, String telefono, String email, String contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    public Proveedor(Integer id, String nombre, String direccion, String telefono, String email, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    public Proveedor(String nombre, String direccion, String telefono, String email, String contacto, List<EntradaAlmacen> entradasAlmacen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
        this.entradasAlmacen = entradasAlmacen;
    }

    public Proveedor(Integer id, String nombre, String direccion, String telefono, String email, String contacto, List<EntradaAlmacen> entradasAlmacen) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
        this.entradasAlmacen = entradasAlmacen;
    }

    public Proveedor(String nombre, String direccion, String telefono, String email, String website, String contacto, List<EntradaAlmacen> entradasAlmacen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.website = website;
        this.contacto = contacto;
        this.entradasAlmacen = entradasAlmacen;
    }

    public Proveedor(Integer id, String nombre, String direccion, String telefono, String email, String website, String contacto, List<EntradaAlmacen> entradasAlmacen) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.website = website;
        this.contacto = contacto;
        this.entradasAlmacen = entradasAlmacen;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<EntradaAlmacen> getEntradasAlmacen() {
        return entradasAlmacen;
    }

    public void setEntradasAlmacen(List<EntradaAlmacen> entradasAlmacen) {
        this.entradasAlmacen = entradasAlmacen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Proveedor other = (Proveedor) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
    
}//end class
