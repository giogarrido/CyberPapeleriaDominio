package entidades;

import entidades.Producto;
import entidades.Proveedor;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-09T21:05:30", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EntradaAlmacen.class)
public class EntradaAlmacen_ { 

    public static volatile SingularAttribute<EntradaAlmacen, Integer> cantidadComprada;
    public static volatile SingularAttribute<EntradaAlmacen, Float> precioCompra;
    public static volatile SingularAttribute<EntradaAlmacen, Calendar> fechaEntrada;
    public static volatile SingularAttribute<EntradaAlmacen, Proveedor> proveedor;
    public static volatile SingularAttribute<EntradaAlmacen, Integer> id;
    public static volatile SingularAttribute<EntradaAlmacen, Producto> producto;

}