package poop7;
/**
 * Esta es la Sub-clase Alumno.
 * @author ドディス
 */
public class Alumno extends Persona
{
    private int numCuenta;
    private String facultad;
    
    /**
     * El constructor vacío.
     */
    public Alumno() {
    }    
    
    /**
     * Constructor que recibe todos los parámetros.
     * @param nombre Es el nombre de la persona, de tipo String.
     * @param edad Es la edad de la persona, de tipo int.
     * @param estatura Es la estatura de la persona, de tipo double.
     * @param numCuenta Es el número de cuenta del alumno, de tipo int.
     * @param facultad Es la facultad a la que pertenece el alumno, de tipo String.
     */
    public Alumno(String nombre, int edad, double estatura, int numCuenta, String facultad) {
        super(nombre, edad, estatura);
        this.numCuenta = numCuenta;
        this.facultad = facultad;
    }
    
    /**
     * Devuelve el atributo numCuenta.
     * @return numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    
    /**
     * Permite modificar el atributo numCuenta.
     * @param numCuenta 
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    /**
     * Devuelve el atributo facultad.
     * @return facultad
     */
    public String getFacultad() {
        return facultad;
    }
    
    /**
     * Permite modificar el atributo facultad.
     * @param facultad 
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numCuenta=" + numCuenta + ", facultad=" + facultad + '}';
    }
    
    /**
     * Método único de la clase Alumno.
     * Imprime una cadena que representa que está realizando una acción.
     */
    public void estudiar()
    {
        System.out.println("\nEstoy estudiando.");
    }
}
