package entidades;

import entidades.DetalleVenta;
import entidades.EntradaAlmacen;
import entidades.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-08T09:26:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile ListAttribute<Inventario, EntradaAlmacen> entradasAlmacen;
    public static volatile SingularAttribute<Inventario, Integer> cantidadExistencia;
    public static volatile SingularAttribute<Inventario, Integer> id;
    public static volatile SingularAttribute<Inventario, Float> precioVenta;
    public static volatile ListAttribute<Inventario, Producto> productos;
    public static volatile ListAttribute<Inventario, DetalleVenta> detalleVentas;

}