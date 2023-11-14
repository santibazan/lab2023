import java.util.Scanner;
public class ej2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int i, j;
        int filas = 3, columnas = 3;
        int[][] matA = new int[filas][columnas];
        int[][] matB = new int[filas][columnas];


        for (i=0; i<filas; i++){
            for (j=0; j<columnas; j++){
                System.out.println("A [" + i + "] [" + j + "]= ");
                matA[i][j] = leer.nextInt();
            }
        }
        for (i=0; i<filas; i++){
            for (j=0; j<columnas; j++){
                System.out.println("B [" + i + "] [" + j + "]= ");
                matB[i][j] = leer.nextInt();
            }
        }

        int [][] resultado = multipMatrices(matA, matB);
        imprimirMatrices(resultado);


    }
    public static int[][] multipMatrices(int[][] matA, int[][] matB) {
        int filas = matA.length;
        int columnas = matA[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matA[i][j] * matB[i][j];
            }
        }
        return resultado;
    }
    public static void imprimirMatrices(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}