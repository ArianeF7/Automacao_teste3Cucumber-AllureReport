package steps;

import Drivers.DriverManagerFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;
import pages.CriarMovimentacao;
import pages.Home;
import pages.Login;

public class MovimentacaoSteps extends DriverManagerFactory {


   private Login login = PageFactory.initElements(getDriver(), Login.class);
   private Home homeNav = PageFactory.initElements(getDriver(), Home.class);
   private CriarMovimentacao criarMov = PageFactory.initElements(getDriver(), CriarMovimentacao.class);


    @Dado("que o usuario ja tenha um cadastro no site E ja tenha uma conta cadastrada")
    public void queOUsuarioJaTenhaUmCadastroNoSite() {
        login.acessaSite();
        login.RealizarLogin();
    }

    @Quando("ele preencher os dados da movimentaçao ")
    public void elePreencherOsDadosDaMovimentacao() {
        homeNav.home();
    }

    @Entao("A movimentação será criada")
    public void aMovimentacaoSeraCriada() {
        criarMov.CriarMovimentacao();
    }
}
