package pPersonas;


public class Principal {
    public static void main(String[] args) {
        //Profesor p= new Profesor("JAVA");
        //System.out.println(p.saludar());
        Persona c= new Persona("Pepe");
        System.out.println(c.saludar());
        Empleado e= new Empleado("Manuel","h","Google",50);
        System.out.println(e.saludar());
        Alumno a= new Alumno("Miguel","Hola","Segundo");
        System.out.println(a.saludar());
    }
}
