import java.util.ArrayList;

public class ej21 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);

        int suma = 0;

        for (int i = 0; i < numeros.size();i++){
            suma = numeros.get(i)+suma;
        }
        System.out.println("El promedio de los elementos del array es "+ suma/numeros.size());
    }
}
