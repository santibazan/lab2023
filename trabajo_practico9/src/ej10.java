import java.util.ArrayList;

public class ej10 {
    public static void main(String[] args) {

        ArrayList <Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);

        ArrayList <Integer> array2 = new ArrayList<>();
        array2.add(5);
        array2.add(6);
        array2.add(7);
        array2.add(8);

        array1.addAll(array2);
        System.out.println("La lista completa queda "+ array1);
    }
}
