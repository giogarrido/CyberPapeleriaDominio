package entidades;

import entidades.Inventario;
import entidades.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-08T09:26:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleVenta, Integer> id;
    public static volatile SingularAttribute<DetalleVenta, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Float> precioVendido;
    public static volatile SingularAttribute<DetalleVenta, Float> importe;
    public static volatile SingularAttribute<DetalleVenta, Inventario> inventario;

}