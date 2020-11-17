package poop7;
/**
 * Es la clase Empleado.
 * @author ドディス
 */
public class Empleado
{
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    /**
     * Es el contructor vacío.
     */
    public Empleado() {
    }

    /**
     * Constructor que recibe tres parámetros.
     * @param nombre Es el nombre del Empleado, de tipo String.
     * @param numEmpleado Es el número que le corresponde como empleado, de tipo int.
     * @param sueldo Es el sueldo que gana el empleado, de tipo int.
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Devuelve el atributo nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite modificar el atributo nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo numEmpleado
     * @return numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Permite modificar el atributo numEmpleado.
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
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
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    /**
     * Método único de la clase Empleado.
     * A través de un cálculo, modifica aumentando el atributo sueldo.
     * @param porcentaje
     * @return 
     */
    public int aumentarSueldo(int porcentaje)
    {
        sueldo += (int) (sueldo * porcentaje /100);
        return sueldo;
    }
}