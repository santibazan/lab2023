import java.util.ArrayList;

public class ej16 {
    public static void main(String[] args) {
        ArrayList <String> cadena = new ArrayList<>();
        cadena.add("Santiago");
        cadena.add("Nahuel");
        cadena.add("Bazan");

        String concat = String.join(" ", cadena);

        System.out.println(concat);

    }
}
