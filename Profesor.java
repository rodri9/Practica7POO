package poop7;
/**
 * Esta es la Sub-clase Profesor.
 * @author ドディス
 */
public class Profesor extends Trabajador
{
    private int numTrabajador;
    private String materia;

    /**
     * Es el constructor vacío.
     */
    public Profesor() {
    }

    /**
     * Constructor que recibe todos los parámetros.
     * @param nombre Es el nombre de la persona, de tipo String.
     * @param edad Es la edad de la persona, de tipo int.
     * @param estatura Es la estatura de la persona, de tipo double.
     * @param sueldo Es el sueldo que gana el trabajador, de tipo int.
     * @param numTrabajador Es el número que le corresponde como trabajador al profesor, de tipo int.
     * @param materia Es la materia que imparte el profesor, de tipo String.
     */
    public Profesor(String nombre, int edad, double estatura, int sueldo, int numTrabajador, String materia) {
        super(nombre, edad, estatura, sueldo);
        this.numTrabajador = numTrabajador;
        this.materia = materia;
    }

    /**
     * Devuelve e atributo numTrabajador
     * @return numTrabajador
     */
    public int getNumTrabajador() {
        return numTrabajador;
    }

    /**
     * Permite modificar el atributo numTrabajador.
     * @param numTrabajador 
     */
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    /**
     * Devuelve el atributo materia.
     * @return materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Permite modificar el atributo materia.
     * @param materia 
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "numTrabajador=" + numTrabajador + ", materia=" + materia + '}';
    }

    /**
     * Método único de la clase Profesor.
     * Imprime una cadena que representa que está realizando una acción.
     */
    public void darClase()
    {
        System.out.println("\nEstoy dando clase de "+materia);
    }
}
