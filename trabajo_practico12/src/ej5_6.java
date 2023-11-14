import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej5_6 {
    public static void main(String[] args) {
        /*
        •	Comprobar si el String cadena contiene “abc”.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String cadena = sc.nextLine();
        String patron = "abc";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);

        if (matcher.find()){
            System.out.println("cadena valida");
        }else{
            System.out.println("cadena no valida");
        }
    }
}