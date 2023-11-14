import java.util.ArrayList;
import java.util.Collections;

public class ej25 {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<>();

        cadena.add("Santiago");
        cadena.add("Nahuel");
        cadena.add("Bazan");
        cadena.add("Del Corso");

        Collections.sort(cadena);

        System.out.println("La lista ordenada seria "+ cadena);

    }
}
