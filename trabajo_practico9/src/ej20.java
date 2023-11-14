import java.util.ArrayList;

public class ej20 {
    public static void main(String[] args) {
        ArrayList <String> cadena = new ArrayList<>();
        cadena.add("Santiago");
        cadena.add("nahuel");
        cadena.add("Bazan");

        String large = "";

        for (String palabra: cadena) {
            if (palabra.length() > large.length()){
                large = palabra;
            }
        }

        System.out.println("El termino mas largo en la lista es "+ large);


    }
}
