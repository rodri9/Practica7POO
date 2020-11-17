package poop7;
/**
 * Esta es la Sub-clase Trabajador.
 * @author ドディス
 */
public class Trabajador extends Persona
{
    private int sueldo;
    
    /**
     * El constructor vacío.
     */
    public Trabajador() {
    }
    
    /**
     * Constructor que recibe cuatro parámetros.
     * @param nombre Es el nombre de la persona, de tipo String.
     * @param edad Es la edad de la persona, de tipo int.
     * @param estatura Es la estatura de la persona, de tipo double.
     * @param sueldo Es el sueldo que gana el trabajador, de tipo int.
     */
    public Trabajador(String nombre, int edad, double estatura, int sueldo) {
        super(nombre, edad, estatura);
        this.sueldo = sueldo;
    }
    
    /**
     * Devuelve el atributo sueldo.
     * @return sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    
    /**
     * Permite modificar el atributo sueldo.
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        if(sueldo >= 0)
            this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +  " sueldo=" + sueldo + '}';
    }
    
    /**
     * Método único de la clase Trabajador.
     * A través de un cálculo, modifica aumentando el atributo sueldo.
     * @param porcentaje
     * @return sueldo
     */
    public int aumentarSueldo(int porcentaje)
    {
        sueldo += (int) (sueldo * porcentaje /100);
        return sueldo;
    }
}
