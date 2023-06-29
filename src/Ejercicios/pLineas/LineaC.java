package Ejercicios.pLineas;

enum Color {Rojo,Verde,Negro};
public class LineaC extends Linea{
    private Color color;
    public LineaC(){
        super(); //Apunta a Linea
        this.color=Color.Negro; //Darle valor a color
    }
    public LineaC(Punto p1,Punto p2, Color color){
        super(p1,p2);//El super es con los heredados
        if (color==null){
            this.color=Color.Negro;
        }
        else this.color=color;
    }
    public String pintar(){
        return super.pintar()+ "Color: "+color;
    }
}
