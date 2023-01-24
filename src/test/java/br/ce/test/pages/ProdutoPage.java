package br.ce.test.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static br.ce.test.driverFactory.Hooks.getDriver;


public class ProdutoPage {

    BasePage base = new BasePage();
    public ProdutoPage() {
        PageFactory.initElements(getDriver(), this);
    }

//    @FindBy(how = How.ID, using = "startdate")
//    private WebElement data;

    @FindBy(how = How.ID, using = "openstartdatecalender")
    private WebElement data;
    @FindBy(how = How.ID, using = "insurancesum")
    private WebElement soma;

    @FindBy(how = How.ID, using = "meritrating")
    private WebElement avaliacao;

    @FindBy(how = How.ID, using = "damageinsurance")
    private WebElement danos;

    @FindBy(how = How.XPATH, using = "//*/input[@id='EuroProtection']/../span")
    private WebElement produtos;

    @FindBy(how = How.ID, using = "courtesycar")
    private WebElement carro;

    @FindBy(how = How.ID, using = "nextselectpriceoption")
    private WebElement proximo;

    @FindBy(how = How.XPATH, using = "//a[@class='ui-state-default']/..//a[contains(text(),'20')]")
    private WebElement dia;

    @FindBy(how = How.XPATH, using = "//div[@id='ui-datepicker-div']//a[@class='ui-datepicker-next ui-corner-all']")
    private WebElement nextData;

    @FindBy(how = How.XPATH, using = "//div[@id='ui-datepicker-div']/div/div/span[contains(text(),'March')]")
    private WebElement mesData;
////td[@class=' ui-datepicker-week-end ']//a[contains(text(),'29')]

    public void setData(){
        base.clicar(data);
        base.clicar(nextData);
        base.clicar(nextData);
        Assert.assertEquals("March",base.ValidarText(mesData));
        base.clicar(dia);
    }
    public void setSoma(){
        base.select(soma, "10000000");
    }
    public void setAvaliacao(){
        base.select(avaliacao, "Bonus 5");
    }
    public void setDanos(){
        base.select(danos, "Partial Coverage");
    }
    public void setProdutos(){
            base.clicar(produtos);
        }
    public void setCarro(){
        base.select(carro, "Yes");
    }
   public void setProximo(){
        base.clicar(proximo);
    }


    public void cadastroProduto(){
        setData();
        setSoma();
        setAvaliacao();
        setDanos();
        setProdutos();
        setCarro();
        setCarro();
        setProximo();
    }
}