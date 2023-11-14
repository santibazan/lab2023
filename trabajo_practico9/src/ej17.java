import java.util.ArrayList;
import java.util.HashSet;
public class ej17 {
    public static void main(String[] args) {
        ArrayList <String> cadena = new ArrayList<>();
        cadena.add("Santiago");
        cadena.add("Nahuel");
        cadena.add("Santiago");
        cadena.add("Bazan");

        HashSet<String> elementosUnicos = new HashSet<String>();
        elementosUnicos.addAll(cadena);

        cadena.clear();;
        cadena.addAll(elementosUnicos);
        System.out.println("ArrayList después de eliminar duplicados: " + cadena);
    }
}
