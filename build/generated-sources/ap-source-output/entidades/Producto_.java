package entidades;

import entidades.Categoria;
import entidades.Proveedor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-01T21:07:59", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Float> precioActual;
    public static volatile ListAttribute<Producto, Proveedor> proveedores;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}