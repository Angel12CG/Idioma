package Ingles;
public class Datos{
    private int idJugador;
    private String Nombre;
    private String N_Usuario;
    private String Password;
    private int N_D_J;
    private int N_D_J_G;
    private int N_D_J_P;

    public Datos(int idJugador, String Nombre, String N_Usuario, String Password, int N_D_J, int N_D_J_G, int N_D_J_P) {
        this.idJugador = idJugador;
        this.Nombre = Nombre;
        this.N_Usuario = N_Usuario;
        this.Password = Password;
        this.N_D_J = N_D_J;
        this.N_D_J_G = N_D_J_G;
        this.N_D_J_P = N_D_J_P;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getN_Usuario() {
        return N_Usuario;
    }

    public void setN_Usuario(String N_Usuario) {
        this.N_Usuario = N_Usuario;
    }

    public String getContraseña() {
        return Password;
    }

    public void setContraseña(String Contraseña) {
        this.Password = Contraseña;
    }

    public int getN_D_J() {
        return N_D_J;
    }

    public void setN_D_J(int N_D_J) {
        this.N_D_J = N_D_J;
    }

    public int getN_D_J_G() {
        return N_D_J_G;
    }

    public void setN_D_J_G(int N_D_J_G) {
        this.N_D_J_G = N_D_J_G;
    }

    public int getN_D_J_P() {
        return N_D_J_P;
    }

    public void setN_D_J_P(int N_D_J_P) {
        this.N_D_J_P = N_D_J_P;
    }



}
