package pHerencia1;

public class Persona {
    public int edad; //Visibilidad public:Pueden acceder todas las clases
    private String nombre; //Visibilidad private:Solamente puede acceder la propia clase. Si no tienen hijos
    //float peso; //Visibilidad friendly,de paquete o por defecto:Solamente pueden acceder las clases del mismo paquete
    protected float peso; //Visibilidad de paquete + subclases
    //Para las clases que tiene hijos
    public void soy (){
        System.out.println("Persona");
    }
    final public void metodo(){
        //Un metodo final se hereda pero no se puede sobreescribir
    }
    public String getNombre(){
        return nombre;
    }

}
