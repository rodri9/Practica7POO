package poop7;
/**
 * Es la Sub-clase Gerente.
 * @author ドディス
 */
public class Gerente extends Empleado
{
    private int presupuesto;

    /**
     * Es el constructor vacío.
     */
    public Gerente() {
    }

    /**
     * Constructor que recibe todos los parámetros.
     * @param nombre Es el nombre del Empleado, de tipo String.
     * @param numEmpleado Es el número que le corresponde como empleado, de tipo int.
     * @param sueldo
     * @param presupuesto 
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * Devuelve el atributo presupuesto.
     * @return presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * Permite modificar el atributo presupuesto.
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Permite modificar el atributo presupuesto en función de dos parámetros.
     * @param anio Son los años que lleva trabajando el gerente, de tipo int.
     * @param tasa Una tasa en base a la cual aumentará el presupesto.
     */
    public void setPresupuesto(int anio, float tasa) {
        this.presupuesto += (int) (presupuesto / (anio * tasa)); 
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
