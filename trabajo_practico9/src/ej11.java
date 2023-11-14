import java.util.ArrayList;

public class ej11 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println("La lista sin los numeros pares es "+ numeros);
    }
}
