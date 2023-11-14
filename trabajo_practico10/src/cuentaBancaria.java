public class cuentaBancaria {
    int saldo;
    int numero_cuenta;

    public int retirar (int retiro) {
        if (retiro > saldo) {

            return System.out.println("Saldo insuficiente");

        } else {
            System.out.println("Transaccion exitosa");
            saldo = saldo - retiro;
            return saldo;
        }
    }

    public int depositar(int deposito){
        saldo = saldo + deposito;
        System.out.println("Retirando dinero...");
        return saldo;

    }
}
