package objetos;


import io.appium.java_client.MobileElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidades.PropertyLoader;
import utilidades.Usuario;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")

public class PaginaLogin extends PageObject {

    static PropertyLoader loadProperty = new PropertyLoader();

    static Usuario user;
    @FindBy(id = "#txtUsername")
    WebElementFacade campoUsuario;

    @FindBy(id = "#txtPassword")
    WebElementFacade campoPassword;

    @FindBy(id = "#btnLogin")
    WebElementFacade botonLogin;

    @FindBy(id = "#menu_admin_viewAdminModule")
    WebElementFacade botonMenuAdmin;

    public   void login(Usuario user) {
        campoUsuario.sendKeys(Usuario.getUser());
        campoPassword.sendKeys(Usuario.getPassword());
        botonLogin.click();

    }

    public static void cargarUsuario(){
    //metodo para cargar dfatos de usuario desde el param.properties
        Usuario user = new Usuario(PropertyLoader.loadProperties().getProperty("usuario"),
                PropertyLoader.loadProperties().getProperty("password"));
    }


    public  boolean isUserLogged(){
        botonMenuAdmin.click();
    }

}
