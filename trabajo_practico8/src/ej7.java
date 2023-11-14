import java.util.Scanner;
public class ej7 {
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
        busqueda(vec);

    }

    public static void busqueda(int[][] vec) {
        int i, j, mayor = 0;
        for (i = 0; i<vec.length; i++) {
            for (j=0; j<vec.length;j++){
                if (vec[i][j]>mayor){
                    mayor=vec[i][j];
                }

            }
        }
        System.out.println("El numero mayor es "+ mayor+" y se encuentra en la posicion "+i+" ");

    }

}