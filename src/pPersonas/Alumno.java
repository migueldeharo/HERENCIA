package pPersonas;

public class Alumno extends Persona{
    private String dni;
    private String curso;
    public Alumno (String nombre, String dni, String curso){
        super(nombre);
        if (curso!=null){
            this.curso=curso;
        }
    }
    public String saludar(){
        return "Que pasa! Soy de "+curso;
    }
    public String toString(){
        String s=new String();
        s+="Nombre: "+nombre+" Dni: "+dni+" Curso: "+curso;
        return s;
    }
}
