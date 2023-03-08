package entidades;

import entidades.Caja;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-08T09:26:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Gasto.class)
public class Gasto_ { 

    public static volatile SingularAttribute<Gasto, String> autoriza;
    public static volatile SingularAttribute<Gasto, Float> costo;
    public static volatile SingularAttribute<Gasto, String> concepto;
    public static volatile SingularAttribute<Gasto, Integer> id;
    public static volatile SingularAttribute<Gasto, Caja> caja;
    public static volatile SingularAttribute<Gasto, Calendar> fechaGasto;

}