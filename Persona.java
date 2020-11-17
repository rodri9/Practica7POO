package poop7;
/**
 * Esta es la clase Persona.
 * @author ドディス
 */
public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    
    /**
     * Este es el constructor que recibe tres parámetros.
     * @param nombre Es el nombre de la persona, de tipo String.
     * @param edad Es la edad de la persona, de tipo int.
     * @param estatura Es la estatura de la persona, de tipo double.
     */
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
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
     * Devuelve el atributo edad.
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Permite modificar el atributo edad.
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Devuelve el atributo estatura.
     * @return estatura
     */
    public double getEstatura() {
        return estatura;
    }
    
    /**
     * Permite modificar el atributo estatura.
     * @param estatura 
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
}
