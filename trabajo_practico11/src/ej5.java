import java.util.ArrayList;
import java.util.Random;
public class ej5 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> pares = new ArrayList<>();
        while (pares.size()< 20){
            int aleatorios = random.nextInt(100)+1;
            if (aleatorios % 2 == 0){
                pares.add(aleatorios);
            }
        }
        int suma = 0;
        for (int numero: pares) {
            suma += numero;
        }
        double promedio = suma / pares.size();
        System.out.println("El promedio aritmetico es "+ promedio);
        System.out.println("Los numeros iguales al promedio: ");
        for (int numeros: pares) {
            if (numeros == promedio){
                System.out.println("El numero "+ numeros + " es igual al promedio");
            }
        }
        System.out.println("Los numeros mayores al promedio: ");
        for (int numeros: pares) {
            if (numeros > promedio){
                System.out.println("El numero "+ numeros + " es mayor al promedio");
            }
        }
        System.out.println("Los numeros menores al promedio: ");
        for (int numeros: pares) {
            if (numeros < promedio){
                System.out.println("El numero "+ numeros + " es menor al promedio");
            }
        }
    }
}
