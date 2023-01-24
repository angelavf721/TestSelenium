package br.ce.test.pages;

import br.ce.test.driverFactory.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeguroPage {

    BasePage base = new BasePage();

    public SeguroPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    @FindBy(how = How.ID, using = "firstname")
    private WebElement name;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement sobrenome;

    @FindBy(how = How.ID, using = "birthdate")
    private WebElement dataN;

    @FindBy(how = How.XPATH, using = "//*/input[@id='genderfemale']/../span")
    private WebElement genero;

    @FindBy(how = How.ID, using = "streetaddress")
    private WebElement endereco;

    @FindBy(how = How.ID, using = "country")
    private WebElement pais;

    @FindBy(how = How.ID, using = "zipcode")
    private WebElement codigo;

    @FindBy(how = How.ID, using = "city")
    private WebElement cidade;

    @FindBy(how = How.ID, using = "occupation")
    private WebElement ocupacao;

    @FindBy(how = How.XPATH, using = "//p[@class='group']//label/input/../span[@class='ideal-check']")
    private WebElement hobbis;

    @FindBy(how = How.XPATH, using = "//p[@class='group']//label/input[@id='bungeejumping']/../span[@class='ideal-check']")
    private WebElement bungee;

    @FindBy(how = How.XPATH, using = "//p[@class='group']//label/input[@id='skydiving']/../span[@class='ideal-check']")
    private WebElement skydiving;

    @FindBy(how = How.ID, using = "website")
    private WebElement site;

    @FindBy(how = How.ID, using = "picture")
    private WebElement cenario;
    @FindBy(how = How.ID, using = "nextenterproductdata")
    private WebElement next;

    public void setNome(String texto){
        base.escrever(name, texto);
    }
    public void setSobrenome(String texto){
        base.escrever(sobrenome, texto);
    }
    public void setDataN(String texto){
        base.escrever(dataN, texto);
    }

    public void setGenero(){
        base.clicar(genero);
    }

    public void setEndereco(String texto){
        base.escrever(endereco, texto);
    }
    public void setPais(){
        base.select(pais,"Brazil");
    }

    public void setHobbis(){
       base.clicar(hobbis);
       base.clicar(bungee);
       base.clicar(skydiving);
//       base.select(hobbis,"BungeeJumping");
//        base.selectCombo(hobbis,value1);
        //,String value2,String value3
    }

    public void setCodigo(String texto){
        base.escrever(codigo, texto);
    }
    public void setCidade(String texto){
        base.escrever(cidade, texto);
    }
    public void setOcupacao(){
        base.select(ocupacao,"Public Official");
    }
    public void setWeb(String texto){
        base.escrever(site, texto);
    }
   // public void setCenario(){
       // base.clicar(cenario);
       // base.escrever(cenario,"C:\\Users\\AngelVas\\Pictures\\istockphoto.jpg");

   // }
    public void setNext(){
        base.clicar(next);
    }

    public void cadastroSeguro(){
        setNome("Maria");
        setSobrenome("Antonieta");
        setDataN("01/19/1999");
        setGenero();
        setEndereco("Qnm 40 C 15");
        setPais();
        setCodigo("125850");
        setCidade("Taguatinga");
        setOcupacao();
        setHobbis();
        setWeb("batata.com");
        setNext();
    }

}