import java.util.ArrayList;

public class ej19 {
    public static void main(String[] args) {

        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(14);
        numeros.add(20);
        numeros.add(5);

        int buscador = 6;
         boolean contieneNumero = numeros.contains(buscador);

        if (contieneNumero) {
            System.out.println("El ArrayList contiene el número " + buscador);
        } else {
            System.out.println("El ArrayList no contiene el número " + buscador);
        }
    }
}
