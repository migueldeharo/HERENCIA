package pPersonas;

public class Profesor extends Empleado{
    private String asignatura;
    public Profesor (String nombre, String dni, String empresa, String asignatura, float sueldo){
        super(nombre,dni,empresa,sueldo);
    }
    public String saludar (){
        return "Buenos dias soy el profesor de"+" "+asignatura;
    }
}
