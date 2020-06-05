package steps;

import Drivers.DriverManagerFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;
import pages.CriarMovimentacao;
import pages.Home;
import pages.Login;

public class MovimentacaoSteps extends DriverManagerFactory {


   private Login login = PageFactory.initElements(getDriver(), Login.class);
   private Home homeNav = PageFactory.initElements(getDriver(), Home.class);
   private CriarMovimentacao criarMov = PageFactory.initElements(getDriver(), CriarMovimentacao.class);


    @Dado("^eu ja tenha um cadastro no site E tenha acessado a pagina de movimentacao$")
    public void euJaTenhaUmCadastroNoSite() {
        login.acessaSite();
        login.RealizarLogin();
    }

    @Quando("^eu criar a movimentacao$")
    public void euCriaraMovimentacao() {
        homeNav.home();
        criarMov.CriarMovimentacao();
    }

    @Entao("^devo ver a mensagem de confirmacao$")
    public void devoVeraMensagemDeCondirmacao() {
        criarMov.ConfirmaMovimentacao();
    }
}
