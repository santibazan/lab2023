import java.util.ArrayList;

public class ej8 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        ArrayList <Integer> arrayVacio = new ArrayList<>(numeros);

        System.out.println("Lista nueva: "+ arrayVacio);
    }
}
