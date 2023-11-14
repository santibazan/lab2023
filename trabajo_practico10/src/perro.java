public class perro {
        String nombre;
        String raza;
        int edad;

        public perro(String nombre, String raza, int edad){
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }
        public String getNombre() {return nombre;}
        public String getRaza(){return raza;}
        public int getEdad(){return edad;}
        public void ladrar(){
            System.out.println("El perro hace guau guau");
        }
    }


