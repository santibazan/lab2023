import java.util.ArrayList;

public class ej6 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        if (numeros.isEmpty()){
            System.out.println("Array vacio");
        }else {
            System.out.println("Array con valores");
        }
    }
}
