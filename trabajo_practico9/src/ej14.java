import java.util.ArrayList;

public class ej14 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(100);
        numeros.add(9);
        numeros.add(101);

        int minor = 100;
        for ( Integer min: numeros) {
            if (min < minor){
                minor = min;
            }
        }
        System.out.println("El numero menor de la lista es "+ minor);
    }
}
