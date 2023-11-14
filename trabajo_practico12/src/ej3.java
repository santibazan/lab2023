import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        /*
        Diseña un programa en un lenguaje de programación (Java) que utilice expresiones
        regulares para validar y verificar los datos en tu conjunto de datos. Por ejemplo,
        puedes verificar si una dirección de correo electrónico es válida o si un número
        de teléfono sigue un formato específico.

	    Validar entrada de datos en un arraylist y aplicarlo.

         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        String patron = "^\\w+@[a-zA-Z]+\\.[a-zA-Z]+$";

        System.out.print("Correo electronico: ");
        String particular_data = sc.nextLine();

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(particular_data);

        if (matcher.matches()){
            System.out.println("Correo electronico valido");
            data.add(particular_data);
        }else{
            System.out.println("Correo electronico no valido, considera que el correo no puede tener caracteres especiales");
        }

        patron = "^54261[0-9]{7}$";

        System.out.print("Numero de telefono: ");
        particular_data = sc.nextLine();

        pattern = Pattern.compile(patron);
        matcher = pattern.matcher(particular_data);

        if (matcher.matches()){
            System.out.println("Numero de telefono valido");
            data.add(particular_data);
        }else{
            System.out.println("Numero de telefono no valido, considera usar los prefijos de tu pais y provincia");
        }

        System.out.print("Fecha de nacimiento dd/mm/aaaa: ");
        particular_data = sc.nextLine();

        patron = "^\\d{2}/\\d{2}/\\d{4}$";

        pattern = Pattern.compile(patron);
        matcher = pattern.matcher(particular_data);

        if (matcher.find()){
            System.out.println("Fecha ingresada valida!");
            data.add(particular_data);
        }else{
            System.out.println("Fecha ingresada no valida");
        }







    }
}