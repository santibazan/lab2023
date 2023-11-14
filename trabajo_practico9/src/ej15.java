import java.util.ArrayList;

public class ej15 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(23);
        numeros.add(13);
        numeros.add(4);
        numeros.add(7);
        numeros.add(100);

        int suma = 0;

        for (int i = 0; i < numeros.size(); i++){
            suma=numeros.get(i)+suma;
        }
        System.out.println("La suma de todos los elementos de lal lista es de "+ suma);
    }
}
