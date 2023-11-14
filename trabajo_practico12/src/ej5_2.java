import java.util.Scanner;
import java.util.regex.*;
public class ej5_2 {
    public static void main(String[] args) {
        /*
        •	Comprobar si el String cadena no empieza por un dígito.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = sc.nextLine();
        String patron = "^.*[^0-9]";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);

        if (matcher.matches()){
            System.out.println("La cadena no acaba con un digito");
        }else{
            System.out.println("La cadena acaba con un digito");
        }
    }
}