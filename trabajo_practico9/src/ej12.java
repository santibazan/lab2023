import java.util.ArrayList;

public class ej12 {
    public static void main(String[] args) {
        ArrayList <String> cadenas = new ArrayList<>();
        cadenas.add("Santiago");
        cadenas.add("Nahuel");
        cadenas.add("Bazan");

        String buscador = "Santiago";
        int indice = -1;

        for (int i = 0; i < cadenas.size(); i++){
            if (cadenas.get(i).equals(buscador)) {
                indice = i;
                break;
            }
        }
        if (indice == -1){
            System.out.println("El elemento ´"+ buscador+"´ no se encontro en la lista");
        }else {
            System.out.println("El elemento ´"+ buscador+"´ se encuentra en la posicion "+ indice);
        }

    }
}
