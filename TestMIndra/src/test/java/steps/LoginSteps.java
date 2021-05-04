package steps;

import net.thucydides.core.annotations.Step;
import objetos.PaginaAdmin;
import objetos.PaginaLogin;

public class LoginSteps   {
    String actor;

    static PaginaLogin login;
    static PaginaAdmin paginaAdmin;

    @Step
    public static  void Usuario(){
        PaginaLogin.cargarUsuario();
    }

    @Step("#actor ingresa a la pagina principal de Orange")
    public void ingresaASitio() {
        login.setDefaultBaseUrl("https://opensource-demo.orangehrmlive.com/index.php");
        login.open();
    }

    public static void loginExitoso( ) {
        // TODO Auto-generated method stub
        paginaAdmin.loginExitoso();

    }

}
