import java.util.ArrayList;

public class ej13 {
    public static void main(String[] args) {
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();

        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);

        array2.add(10);
        array2.add(20);
        array2.add(30);
        array2.add(40);
        array2.add(40);

        if (array1.size() == array2.size()){
            System.out.println("Las dos listas tienen la misma cantidad de elementos");
        }else {
            System.out.println("No tienen la misma cantidad de elementos");
        }
    }
}
