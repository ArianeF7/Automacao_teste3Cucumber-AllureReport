package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.Report;

public class Home {

    @FindBy(css="a[href='/movimentacao']")
    private WebElement abaCriarMovimentacao;

    public void home(){
        Report.takeScreenshot();
        abaCriarMovimentacao.click();
    }
}

