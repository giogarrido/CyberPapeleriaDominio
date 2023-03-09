package entidades;

import entidades.Gasto;
import entidades.Usuario;
import entidades.Venta;
import enumeradores.Estado;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-09T16:01:46", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Caja.class)
public class Caja_ { 

    public static volatile SingularAttribute<Caja, Float> totalGastos;
    public static volatile SingularAttribute<Caja, Calendar> fechaCierre;
    public static volatile SingularAttribute<Caja, Estado> estado;
    public static volatile SingularAttribute<Caja, Float> totalIngresos;
    public static volatile SingularAttribute<Caja, Calendar> fechaApertura;
    public static volatile ListAttribute<Caja, Venta> ventas;
    public static volatile SingularAttribute<Caja, Usuario> usuario;
    public static volatile SingularAttribute<Caja, Integer> id;
    public static volatile SingularAttribute<Caja, Float> saldoCierre;
    public static volatile SingularAttribute<Caja, Float> saldoInicial;
    public static volatile ListAttribute<Caja, Gasto> gastos;

}