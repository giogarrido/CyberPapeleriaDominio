
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    @Column (name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    
    @Column (name = "categoria", nullable = false, length = 50)
    private String categoria;
    
    @Column(name = "precio", nullable = false)
    private float precio;
    
    @Column(name = "stock", nullable = false)
    private int stock;
}
