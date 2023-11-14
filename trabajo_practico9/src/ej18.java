import java.util.ArrayList;

public class ej18 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(23);
        numeros.add(22);
        numeros.add(4);
        numeros.add(8);
        numeros.add(7);

        int suma = 0;

        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) % 2 == 0) {
                suma = numeros.get(i)+suma;
            }
        }
        System.out.println("La suma de todos los elementos pares es "+ suma);
    }
}
