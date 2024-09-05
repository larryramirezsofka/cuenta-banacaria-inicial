import cuentas.Cuenta;
import cuentas.CuentaAhorros;
import cuentas.CuentaCorriente;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cuenta> cuentas = new ArrayList<>();



        //Cuenta cuentaLarry = new Cuenta("Larry", new BigDecimal(1000));

        /*System.out.println(cuentaLarry.titular());
        System.out.println(cuentaLarry.obtenerSaldo());
        cuentaLarry.retirar(new BigDecimal(100));
        System.out.println(cuentaLarry.obtenerSaldo());*/

        CuentaAhorros cuentaBeatriz = new CuentaAhorros("Beatriz", new BigDecimal(1000), 0.02);

        System.out.println(cuentaBeatriz.titular());
        System.out.println(cuentaBeatriz.obtenerSaldo());
        cuentaBeatriz.apicarInteres();
        System.out.println(cuentaBeatriz.obtenerSaldo());
        cuentaBeatriz.mostrarInformacion();

        CuentaCorriente cuentaIvan = new CuentaCorriente("Ivan", new BigDecimal(1000), 100.0);
        System.out.println(cuentaIvan.titular());
        System.out.println(cuentaIvan.obtenerSaldo());
        cuentaIvan.retirar(new BigDecimal(1100));
        System.out.println(cuentaIvan.obtenerSaldo());
        cuentaIvan.mostrarInformacion();


        cuentas.add(cuentaBeatriz);
        cuentas.add(cuentaIvan);

        /*cuentas.forEach(
                cuenta -> {
                    System.out.println(cuenta.titular());
                    System.out.println(cuenta.obtenerSaldo());;
                }
        );*/
    }
}
