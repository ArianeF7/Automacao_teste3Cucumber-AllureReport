package pages;

import Drivers.DriverManagerFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DriverManagerFactory implements DefaultProperties {

    @FindBy(id="email")
    private WebElement txtEmail;
    @FindBy(id="senha")
    private WebElement txtSenha;
    @FindBy(css = "body > div.jumbotron.col-lg-4 > form > button")
    private WebElement btnEntrar;


    public void acessaSite(){
        getDriver().get(URL_BASE);
    }

    public void RealizarLogin(){
        txtEmail.sendKeys("arianeteste1@email.com");
        txtSenha.sendKeys("teste");
        btnEntrar.click();
    }



}
