import java.util.Scanner;
import java.util.regex.*;
public class ej5_3 {
    public static void main(String[] args) {
        /*
        •	Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o
        minúsculas y un máximo de 10.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = sc.nextLine();
        String patron = "[a-z|A-Z]{5,10}";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);

        if (matcher.matches()){
            System.out.println("cadena valida");
        }else{
            System.out.println("cadena no valida");
        }
    }

}