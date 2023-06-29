package Ejercicios.pLineas;

public class Linea{
    protected Punto p1,p2;
    public Linea(){
        this.p1=new Punto();
        this.p2=new Punto();
    }
    public Linea (Punto p1, Punto p2){
        if (p1!=null){
            this.p1=p1;
        }
        if(p2!=null){
            this.p2=p2;
        }
    }
    public String pintar (){
        return p1.pintar()+"------"+p2.pintar();
    }
}
