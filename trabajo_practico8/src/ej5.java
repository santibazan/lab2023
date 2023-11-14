import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, multiplicador;
        int vector;

        System.out.println("Ingrese el tamaño del arreglo: ");
        vector = leer.nextInt();
        int[] vec = new int[vector];

        for (i = 0; i<vec.length; i++) {
            System.out.println("vector " + i + " = ");
            vec[i] = leer.nextInt();
        }
        multiplicacion(vec);

    }


    public static void multiplicacion(int[] vec) {
        Scanner leer = new Scanner(System.in);
        int i, multiplicador;
        System.out.println("Ingrese el numero a multiplicar para cada termino del arreglo: ");
        multiplicador = leer.nextInt();
        for (i = 0; i<vec.length; i++) {
            System.out.println("La multiplicacion del termino " + i + " del vector es: "+multiplicador * vec[i]);
        }
    }

}