import java.util.Scanner;
public class ej4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int i, j;
        int filas = 3, columnas = 3;
        int[][] matA = new int[filas][columnas];

        for (i=0; i<filas; i++){
            for (j=0; j<columnas; j++){
                System.out.println("A [" + i + "] [" + j + "]= ");
                matA[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz original:");
        for (i=0; i<filas; i++){
            for (j=0; j<columnas; j++){
                System.out.print(matA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta:");
        imprimirMatrices(matA);

    }
    public static void imprimirMatrices(int[][] matA) {
        for (int x = 0; x < matA.length; x++) {
            for (int f = 0; f < matA.length; f++) {
                System.out.print(matA[f][x] + " ");
            }
            System.out.println();
        }
        boolean simetric;
        simetric=false;
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA.length; j++) {
                if (matA[i][j] != matA[i][j]) {
                    simetric = false;
                    break;
                }
                simetric = true;
            }
        }
        if (simetric){
            System.out.println("La matriz es simetrica");
        } else{
            System.out.println("La matriz no es simetrica");
        }
    }
}

