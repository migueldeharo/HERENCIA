package Ejercicios.pLineas;

public class Punto {
    private int x,y; //Al no tener hijos, es private

    public Punto(){

    }
    public Punto (int x,int y){
        this.x=x;
        this.y=y;
    }
    public String pintar (){
        return "("+x+","+y+")";
    }
    public boolean equals (Object obj){
        if(obj==this) return true;
        if(obj==null)return false;
        Punto p= (Punto) obj;
        return this.x==p.x && this.y==p.y;
    }
}
