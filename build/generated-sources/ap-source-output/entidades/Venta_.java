package entidades;

import entidades.Caja;
import entidades.Cliente;
import entidades.DetalleVenta;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-09T16:01:46", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Calendar> fecha;
    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, Integer> numTicket;
    public static volatile SingularAttribute<Venta, Float> totalventa;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, Caja> caja;
    public static volatile ListAttribute<Venta, DetalleVenta> detalleVentas;

}