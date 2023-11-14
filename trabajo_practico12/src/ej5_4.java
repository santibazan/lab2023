import java.util.regex.*;
import java.util.Scanner;
public class ej5_4 {
    public static void main(String[] args) {
        /*
        •	Validar el ingreso de un DNI (xx-xxx-xxx).
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su dni en formato xx-xxx-xxx: ");
        String dni = sc.nextLine();
        String patron = "^[0-9]{2}-[0-9]{3}-[0-9]{3}$";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()){
            System.out.println("Dni valido");
        }else{
            System.out.println("Dni no valido");
        }

    }
}