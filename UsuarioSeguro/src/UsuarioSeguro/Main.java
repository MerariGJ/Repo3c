package UsuarioSeguro;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro su = new UsuarioSeguro();

        System.out.println("Ingresa tu nombre: ");
        String name = sc.nextLine();
        su.setnombreUsuario(name);
        System.out.println("Ingresa una contraseña:");
        String password = sc.nextLine();
        su.setPassword(password);

        //System.out.println("Ingresa otra contraseña");
        //String intentPassword = sc.nextLine();
        //System.out.println(su.autenticar(intentPassword));

    }
}
