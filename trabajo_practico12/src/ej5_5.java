import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
public class ej5_5 {
    public static void main(String[] args) {
        /*
        •	Guardar en un arraylist una serie de mails, pero antes de ser guardados deben
        cumplir con las condiciones de las expresiones regulares.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> mails = new ArrayList<>();
        String patron = "\\w+@[a-zA-Z]+\\.[a-zA-Z]+$";

        String mail = "";

        Pattern pattern;
        Matcher matcher;

        while (true){
            System.out.print("Ingrese un mail: ");
            mail = sc.nextLine();

            pattern = Pattern.compile(patron);
            matcher = pattern.matcher(mail);

            if(matcher.matches()){
                System.out.println("Mail valido!");
                mails.add(mail);
            }else{
                System.out.println("Mail no valido, vuelva a ingresar");
                continue;
            }

            System.out.print("Ingrese 1 si quiere salir o cualquier otra tecla para seguir ingresando mails: ");
            String out = sc.nextLine();

            if (out.equals("1")){
                break;
            }
        }


    }
}