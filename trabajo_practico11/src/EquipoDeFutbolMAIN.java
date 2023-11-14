import java.util.ArrayList;
import java.util.Scanner;

public class EquipoDeFutbolMAIN {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<EquipoDeFutbol> jugadores=new ArrayList<>();
        int option=0;

        do {
            System.out.println("Ingrese 1 para agregar jugadores, 2 para eliminar jugadores, 3 para listar la lista de jugadores:");
            option = leer.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombre = leer.nextLine();
                    EquipoDeFutbol jugador = new EquipoDeFutbol(nombre);
                    jugadores.add(jugador);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del jugador a eliminar: ");
                    String jugador_eliminado = leer.nextLine();
                    boolean jugadorEncontrado = false;

                    for (EquipoDeFutbol jugadorActual : jugadores) {
                        if (jugadorActual.getNombre_jugador().equals(jugador_eliminado)) {
                            jugadores.remove(jugadorActual);
                            jugadorEncontrado = true;
                            System.out.println("Jugador eliminado.");
                            break;
                        }

                    }
                    if (!jugadorEncontrado) {
                        System.out.println("El jugador no existe en el plantel.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (option!=3);


            System.out.println("Lista del equipo");
            for (EquipoDeFutbol jugador : jugadores) {
                System.out.println(jugador.getNombre_jugador());

            }

    }

}
