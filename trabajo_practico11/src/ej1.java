import java.util.Scanner;
import java.util.ArrayList;

public class ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> marcasDeAutos = new ArrayList<>();

        while (true){
            System.out.println("Ingrese una marca de autos, si quiere finalizar presione 1");
            String marquitas = leer.nextLine();
            if (marquitas.equalsIgnoreCase("1")){
                break;
            }else{
                marcasDeAutos.add(marquitas);
            }
        }

        System.out.println("Marcas de autos");
        for (String marquitas : marcasDeAutos) {
            System.out.println(marquitas);

        }

    }
}