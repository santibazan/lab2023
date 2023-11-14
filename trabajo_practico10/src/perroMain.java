public class perroMain {
    public static void main(String[] args) {
        perro perro1 = new perro("Lola", "pichichu", 10);
        perro1.ladrar();

        System.out.println("El perro se llama " + perro1.getNombre());
        System.out.println("El perro es de raza " + perro1.getRaza());
        System.out.println("El perro tiene" + perro1.getEdad()+ "años");

    }
}

