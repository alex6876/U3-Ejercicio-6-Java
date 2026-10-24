public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public void cambiarPassword(String passwordActual , String nuevaPassword) {

        if(passwordActual.equals(password)){
            password = nuevaPassword;
            System.out.println("Contraseña cambiada correctamente.");
        }else {
            System.out.println("Error: Validación incorrecta.");
        }
    }

    public boolean validarCredenciales(String passwordIngresada){
        if(password.equals(passwordIngresada)){
            System.out.println("Se ingresó a la cuenta correctamente.");
            return true;
        }else{
            System.out.println("Acceso incorrecto.");
            return false;
        }
    }

}
