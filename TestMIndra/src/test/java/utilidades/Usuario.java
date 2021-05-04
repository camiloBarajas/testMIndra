package utilidades;

public class Usuario {
    static String user = "";
    static String password = "";


    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Usuario.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Usuario.password = password;
    }

    //Constructor
    public Usuario(String user, String password) {
        Usuario.user = user;
        this.password = password;

    }
}
