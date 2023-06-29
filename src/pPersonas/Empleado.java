package pPersonas;

public class Empleado extends Persona{
    protected String dni;
    protected String empresa;
    protected float sueldo;
    public Empleado(String nombre, String dni, String empresa,float sueldo){
        super(nombre);
        if (empresa!=null){
            this.empresa=empresa;
        }
        this.dni=dni;
        this.sueldo=sueldo;

    }


    public String saludar(){
        return "Me llamo "+nombre +" y trabajo en "+empresa;
    }
    public String toString(){
        String s=new String();
        s+="Nombre: "+nombre+" Dni: "+dni+" Empresa: "+empresa;
        return s;
    }
}
