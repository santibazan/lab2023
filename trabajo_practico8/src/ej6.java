import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j;
        int vector;

        System.out.println("Ingrese el tamaño del arreglo: ");
        vector = leer.nextInt();
        int[][] vec = new int[vector][vector];

        for (i = 0; i<vec.length; i++) {
            for (j = 0; j<vec.length;j++){
                System.out.println("matriz [" + i + "]"+"["+j+"] = ");
                vec[i][j] = leer.nextInt();
            }
        }
        sum(vec);

    }

    public static void sum(int[][] vec) {
        int i, j, sum = 0;
        for (i = 0; i<vec.length; i++) {
            for (j=0; j<vec.length;j++){
                sum=sum + vec[i][j];
            }
        }
        System.out.println("La suma total de la matriz es: "+sum);
    }

}