import java.util.ArrayList;

public class ej24 {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<>();

        cadena.add("10");
        cadena.add("30");
        cadena.add("20");
        cadena.add("10");

        int contador = 0;
        String buscador = "10";

        for (String find: cadena) {
            if (find.equals(buscador)){
                contador ++ ;
            }
        }
        System.out.println("La cantidad de veces que aparece el valor " + buscador + " en el array es "+ contador);

    }
}
