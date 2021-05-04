package objetos;

import au.com.bytecode.opencsv.CSVReader;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileReader;




public class PaginaAdmin {

    WebDriver driver;

    CSVReader reader = new CSVReader((new FileReader(CSV_file)));
    String[] cell;

    while((cell=reader.readNext())!=null){
        for(int i=0; i<1; i++){
            String name=cell[i];
            String userName=cell[i+1];
            String password=cell[i+2];

            driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(name);
            driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
            driver.findElement(By.id("systemUser_password")).sendKeys(password);
            driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
            driver.findElement(By.id("btnSave")).click();

        }
    }

    @FindBy(css = "#topSearchSubmit")
    WebElement botonMenuAdmin;


    public  void loginExitoso() {
        // TODO Auto-generated method stub
        PaginaLogin login = new PaginaLogin();



    }
}
