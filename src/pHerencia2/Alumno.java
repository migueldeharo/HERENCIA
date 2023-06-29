package pHerencia2;

public class Alumno extends Persona{
    private float nota;
    public Alumno(){
        super(); //Similar a las rellamadas entre constructores con this, pero con los constructores de la superclase
        //Si no lo ponemos java añade una rellamada de forma implicita al vacio de la suoer clase
        System.out.println("A1");
    }
    public Alumno (String nombre){
        super(nombre);
        System.out.println("A2");
    }
    public Alumno(String nombre, int edad){
        super(nombre,edad);
        System.out.println("A3");
    }
    public Alumno (String nombre, int edad, float nota){
        //super (nombre,edad); //Lo heredado lo mandamos arriba
        this(nombre, edad);
        if (nota>0) this.nota=nota;
    }
}
