package poop7;
/**
 * Esta es la Sub-clase Director.
 * @author ドディス
 */
public class Director extends Trabajador
{
    private String facultadACargo;

    /**
     * El constructor vacío.
     */
    public Director() {
    }

    /**
     * Constructor que recibe todos los parámetros.
     * @param nombre Es el nombre de la persona, de tipo String.
     * @param edad Es la edad de la persona, de tipo int.
     * @param estatura Es la estatura de la persona, de tipo double.
     * @param sueldo Es el sueldo que gana el trabajador, de tipo int.
     * @param facultadACargo Es la facultad de la cual es encargado el director, de tipo String.
     */
    public Director(String nombre, int edad, double estatura, int sueldo, String facultadACargo) {
        super(nombre, edad, estatura, sueldo);
        this.facultadACargo = facultadACargo;
    }

    /**
     * Devuelve el atributo facultadACargo.
     * @return facultadACargo
     */
    public String getFacultadACargo() {
        return facultadACargo;
    }

    /**
     * Permite modificar el atributo facultadACargo.
     * @param facultadACargo 
     */
    public void setFacultadACargo(String facultadACargo) {
        this.facultadACargo = facultadACargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Director{" + "facultadACargo= " + facultadACargo + '}';
    }
    
    /**
     * Método único de la clase Director.
     * Imprime una cadena que representa que está realizando una acción.
     */
    public void administrar()
    {
        System.out.println("\nEstoy haciendo el trabajo administrativo de la facultad.");
    }
}
