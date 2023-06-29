package pHerencia2;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(){
        System.out.println("P1");
    }
    public Persona(String nombre){
        this();
        System.out.println("P2");
    }
    public Persona (String nombre, int edad){
        this(nombre);
        System.out.println("P3");
    }
}
