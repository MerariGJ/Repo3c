package UsuarioSeguro;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;


    public void setnombreUsuario(String nombreUsuario) {
        if (nombreUsuario.isEmpty() || nombreUsuario == null) {
            System.out.println("Los datos ingresados son incorrectos");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setPassword(String password) {
        boolean mayusculas = false, minusculas = false, digitos = false;
        if (password.length() >= 8) {
            for( int i = 0;i < password.length(); i ++) {
                if (Character.isUpperCase(password.charAt(i)) ) {
                    mayusculas = true;
                }
                if (Character.isLowerCase(password.charAt(i)) ) {
                    minusculas = true;
                }
                if (Character.isDigit(password.charAt(i))) {
                    digitos = true;
                }
            }
            if (mayusculas  && minusculas  && digitos) {
                this.password = password;
                System.out.println("Todo ok");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Ingresa una contraseña de al menos 8 caracteres");
        }

    }

    public boolean autenticar(String intentPassword) {
        if (password.equals(intentPassword)) {
            return true;
        }
        return false;
    }


}

