package br.ce.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static br.ce.test.driverFactory.Hooks.getDriver;


public class VeicolosPage {
BasePage base = new BasePage();
    public VeicolosPage() {
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(how = How.ID, using = "make")
    private WebElement mazda;

    @FindBy(how = How.ID, using = "engineperformance")
    private WebElement km;

    @FindBy(how = How.ID, using = "model")
    private WebElement model;

    @FindBy(how = How.ID, using = "dateofmanufacture")
    private WebElement dataS;

    @FindBy(how = How.XPATH, using = "//label[@class='ideal-radiocheck-label']/input[@id='righthanddriveyes']/../span[@class='ideal-radio']")
    private WebElement direcao;

    @FindBy(how = How.ID, using = "numberofseats")
    private WebElement assentos;

    @FindBy(how = How.ID, using = "cylindercapacity")
    private WebElement ccm;
    @FindBy(how = How.ID, using = "numberofseatsmotorcycle")
    private WebElement seats;

    @FindBy(how = How.ID, using = "fuel")
    private WebElement combustivel;

    @FindBy(how = How.ID, using = "payload")
    private WebElement carga;


    @FindBy(how = How.ID, using = "totalweight")
    private WebElement peso;

    @FindBy(how = How.ID, using = "listprice")
    private WebElement preco;
    @FindBy(how = How.ID, using = "licenseplatenumber")
    private WebElement placa;

    @FindBy(how = How.ID, using = "annualmileage")
    private WebElement mi;

    @FindBy(how = How.ID, using = "nextenterinsurantdata")
    private WebElement next;

    public void Modizila(){
        base.select(mazda, "Mazda");
    }
    public void modelo(){
        base.select(model, "Three-Wheeler");
    }
    public void quilometro(String texto){
        base.escrever(km,texto);
    }
    public void cilindro(String texto){
        base.escrever(ccm,texto);
    }

    public void setAssentos(){
        base.select(assentos, "5");
    }
    public void setDataS(String data){
        base.escrever(dataS, data);
    }

    public void setSeats(){
        base.select(seats,"2");
    }
    public void volante(){
        base.clicar(direcao);
    }
    public void setCombustivel(){
        base.select(combustivel,"Diesel");
    }

    public void setCarga(String text){
        base.escrever(carga, text);
    }

    public void setPeso(String text){
        base.escrever(peso, text);
    }
    public void setPreco(String text){
        base.escrever(preco, text);
    }
    public void setPlaca(String text){
        base.escrever(placa, text);
    }
    public void setQuilometragem(String text){
        base.escrever(mi, text);
    }
   public void nextPage(){
        base.clicar(next);
    }

    public void cadastroVeiculos(){
        Modizila();
        modelo();
        cilindro("45");
        quilometro("555");
        setDataS("01/19/2023");
        setAssentos();
        volante();
        setSeats();
        setCombustivel();
        setCarga("444");
        setPeso("120");
        setPreco("5000");
        setPlaca("5654654646");
        setQuilometragem("88888");
        nextPage();
    }

}