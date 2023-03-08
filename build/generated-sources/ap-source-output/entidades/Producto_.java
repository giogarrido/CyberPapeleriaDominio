package entidades;

import entidades.Categoria;
import entidades.EntradaAlmacen;
import entidades.Inventario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-08T09:26:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile ListAttribute<Producto, EntradaAlmacen> entradasAlmacens;
    public static volatile SingularAttribute<Producto, Float> precioCompra;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Inventario> inventario;

}