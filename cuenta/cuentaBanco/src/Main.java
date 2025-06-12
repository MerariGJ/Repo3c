//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exceptions {
        Cuenta cuentaComun = new CuentaComun("MmGgJj1234", "MerariGranados" );
        cuentaComun.depositar (500);
        cuentaComun.retirar (500);

        CuentaAhorros cuentaAhorros = new CuentaAhorros ("MmGgJj1234", "MerariGranados");
        cuentaAhorros.depositar (700);
        cuentaAhorros.retirar(700);
        cuentaAhorros.apliarInteres ();

        }
    }
}