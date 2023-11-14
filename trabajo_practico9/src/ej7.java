import java.util.ArrayList;

public class ej7 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        int maxim = 0;
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        for (Integer max: numeros) {
            if (max> maxim){
                maxim = max ;
            }
        }
        System.out.println("El numero mayor es "+ maxim);
    }
}