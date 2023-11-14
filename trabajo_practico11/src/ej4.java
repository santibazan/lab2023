import java.util.ArrayList;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <Float> numeros = new ArrayList<>();
        double min = 10000.00;
        double max = 0.0;
        for (int i = 0 ; i < 20; i++){
            System.out.println("Ingrese el numero de la posicion "+ i + ": ");
            numeros.add(leer.nextFloat());
        }
        System.out.println("Los numeros ingresados fueron: ");
        for (double num:numeros) {
            System.out.print("|"+num+"|");
        }
        System.out.println(" ");

        for (double num : numeros) {
            if (num>max){
                max = num;
            }
        }
        System.out.println("El numero mayor ingresado fue :"+ max);
        for (double num : numeros) {
            if (num<min){
                min = num;
            }
        }
        System.out.println("El numero menor ingresado fue :"+ min);
    }
}
