package poop7;
/**
 *
 * @author ドディス
 */
public class POOP7 {
    
    public static void main(String[] args) {
        System.out.println("------ Empleado ------"); //Actividad 1
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("\n------ Gerente 1 ------"); //Actividad 2
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        System.out.println("Nombre = "+gerente1.getNombre());
        System.out.println("Número de empleado = " +gerente1.getNumEmpleado());
        System.out.println("Sueldo = " +gerente1.getSueldo());
        System.out.println("Presupuesto = " +gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto = " +gerente1.getPresupuesto());
        
        System.out.println("\n------ Gerente 2 ------"); //Actividad 3
        Gerente gerente2 = new Gerente("Julio", 88, 200000, 500000);
        System.out.println("Nombre = "+gerente2.getNombre());
        System.out.println("Número de empleado = " +gerente2.getNumEmpleado());
        System.out.println("Sueldo = " +gerente2.getSueldo());
        System.out.println("Presupuesto = " +gerente2.getPresupuesto());
        
        //Actividad 4 - Sobreescritura
        System.out.println(gerente2.toString());
        
        //Actividad 5 - Sobrecarga
        System.out.println("Presupuesto = " +gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto = " +gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto = " +gerente2.getPresupuesto());
        
        /*
        Actividad para nosotros: realizar las herencias. 
                                 Hacer diagrama de clases.
        */
        
        /*---  Sub-clases de persona ---*/
        System.out.println("\n------ Alumno ------");
        Alumno alumno = new Alumno("Miguel", 19, 1.66, 317235487, "Facultad de Ingeniería");
        System.out.println(alumno.toString());
        alumno.estudiar();
        
        System.out.println(alumno.getFacultad());
        
        /*--- Sub-clase trabajador -> Director ---*/
        System.out.println("\n------ Director ------");
        Director director = new Director();
        director.setNombre("Graue");
        director.setEdad(60);
        director.setEstatura(1.7);
        director.setSueldo(15000);
        director.setFacultadACargo("Facultad de Química");
        System.out.println(director.toString());
        
        director.administrar();
        director.setSueldo(9000);
        
        System.out.println("Facultad en la cual es director:");
        System.out.println(director.getFacultadACargo());
        
        System.out.println(director.toString());
        
        /*--- Sub-clase trabajador -> Profesor ---*/
        System.out.println("\n------ Profesor ------");
        Profesor profesor = new Profesor("Honorato", 39, 1.75, 19000, 01, "Fundamentos de Programación");
        System.out.println(profesor.getNombre());
        System.out.println(profesor.getMateria());
        
        profesor.darClase();
        System.out.println(profesor.toString());
        
        profesor.aumentarSueldo(50);
        System.out.println("Se ha ganado un aumento.");
        System.out.println(profesor.getSueldo());
    }
}
