import java.util.ArrayList;

public class ej5 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        numeros.remove(4);
        for (int numero : numeros){
            System.out.println(numero);
        }

    }
}
