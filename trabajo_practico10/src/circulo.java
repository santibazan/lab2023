public class circulo {
    int radio;

    public circulo (int radio){
        this.radio = radio;
    }
    public int getRadio(){return radio;}

    public void dates(){
        System.out.println("El area del circulo es "+ 3.14 * (radio*radio)+ ". Gracias");
        System.out.println("El area del circulo es "+ 3.14 * (radio*2)+ ". Gracias");
    }
}
