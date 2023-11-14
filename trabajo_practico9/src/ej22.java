import java.util.ArrayList;
import java.util.Collections;

public class ej22 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);

        Collections.sort(numeros);

        System.out.println("La lista ordenada de forma ascendente queda asi "+ numeros);
    }
}
