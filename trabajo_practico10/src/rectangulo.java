public class rectangulo {
    int ancho;
    int largo;

    public int calcular_area(int ancho,int  largo){
        int area = (ancho*largo);
        return area;
    }
    public int calcular_perimetro(int ancho,int  largo){
        int perimetro = (ancho*2)+(largo*2);
        return perimetro;
    }

}
