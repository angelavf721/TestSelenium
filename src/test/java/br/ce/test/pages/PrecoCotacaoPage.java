package br.ce.test.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static br.ce.test.driverFactory.Hooks.getDriver;

public class PrecoCotacaoPage {

    public PrecoCotacaoPage() {
        PageFactory.initElements(getDriver(),this);
    }
    BasePage base = new BasePage();
    @FindBy(how = How.ID, using = "email")
    private WebElement email;

    @FindBy(how = How.ID, using = "phone")
    private WebElement tele;
    @FindBy(how = How.ID, using = "username")
    private WebElement user;
    @FindBy(how = How.ID, using = "password")
    private WebElement senha;
    @FindBy(how = How.ID, using = "confirmpassword")
    private WebElement confSenha;
    @FindBy(how = How.ID, using = "Comments")
    private WebElement coment;
    @FindBy(how = How.ID, using = "sendemail")
    private WebElement send;
    @FindBy(how = How.XPATH, using = "//*[.='Sending e-mail success!']")
    private WebElement sucess;

    @FindBy(how = How.XPATH, using = "//*/button[@class='confirm']")
    private WebElement buttonOk;
    @FindBy(how = How.XPATH, using = "//table[@id='priceTable']//input[@id='selectgold']/../span")
    private WebElement gold;

    @FindBy(how = How.XPATH, using = "//div[@id='quote-container']//button[@id='nextsendquote']")
    private WebElement next;

    public void setEmail(String text){
        base.escrever(email, text);
    }
    public void setTelefone(String text){
        base.escrever(tele, text);
    }
    public void setUser(String text){
        base.escrever(user, text);
    }
    public void setSenha(String text){
        base.escrever(senha, text);
    }
    public void setConfSenha(String text){
        base.escrever(confSenha, text);
    }
    public void setComents(String text){
        base.escrever(coment, text);
    }
    public void setGold(){
        base.clicar(gold);
    }


    public void alert(){
        base.clicar(send);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));
        String text = sucess.getText();
        Assert.assertEquals("Sending e-mail success!", text);
        base.clicar(buttonOk);
    }
    public void setNext(){
        base.clicar(next);
    }

    public void select(){
        setGold();
        setNext();
    }
}
