import java.util.ArrayList;
import java.util.Collections;

public class ej9 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        System.out.println("El array original es "+ numeros);

        Collections.reverse(numeros);

        System.out.println("El array invertido es "+ numeros);
    }
}
