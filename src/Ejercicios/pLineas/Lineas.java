package Ejercicios.pLineas;

public class Lineas {
    private LineaC[] v;
    public Lineas(LineaC[] v){
        this.v=v;
    }
    public boolean metodo (Punto p){
        //DEvolvemos verdadero si alguna linea pasa por el punto
        if (p==null) return false;
        if (v==null) return false;
        for (int i = 0; i < v.length; i++) {
            if (v[i]!=null){
                if(v[i].p1.equals(p)||v[i].p2.equals(p)){
                    return true;
                }
            }
        }
        return false;
    }
}
