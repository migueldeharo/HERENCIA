package pPersonas;

public class Persona{
    protected String nombre;
    public Persona (String nombre){
        this.nombre=nombre;
    }

    public String saludar(){
        return "Hola soy"+" "+nombre;
    }
    public String toString(){
        String s= new String();
        s+="Nombre: "+nombre;
        return s;
    }

}
