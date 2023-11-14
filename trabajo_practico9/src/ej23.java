import java.util.ArrayList;

public class ej23 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);

        int numEspecif=20;

        numeros.removeIf(numero->numero>numEspecif);
        for (Integer num: numeros) {
            if (num > numEspecif){
                numeros.remove(numeros);
            }

        }
        System.out.println("La nueva lista después de eliminar elementos mayores que" + numEspecif + " quedaria "+ numeros);
    }

}
