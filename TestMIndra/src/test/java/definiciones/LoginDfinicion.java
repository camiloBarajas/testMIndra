package definiciones;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.openqa.selenium.WebElement;
import steps.LoginSteps;

public class LoginDfinicion {
    @Steps
    LoginSteps steps;

    @Given("^Ingresamos como usuario$")
    public void somos_un_usuario(){

        LoginSteps.Usuario();
    }

    @And("^ingresamos al sitio$")
    public void ingresamos_al_sitio() throws Exception{
        System.out.println("Salio de somos un usuario y entro al y");


    }

    @When("^ingresmos el usuario y password$")
    public void  el_login_usuario_password(){
        LoginSteps.loggearse();
    }

    @Then("^el login fue exitoso$")
    public void el_login_exitoso(){
        LoginSteps.loginExitoso();

    }

    @After
    public void close(){


    }
}
