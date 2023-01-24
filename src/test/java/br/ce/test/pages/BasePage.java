package br.ce.test.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static br.ce.test.driverFactory.Hooks.getDriver;


public class BasePage {

    public BasePage() {
        PageFactory.initElements(getDriver(),this);
    }

//    @FindBy(how = How.XPATH, using = "(//span[@class='counter'])")
//    private WebElement texto;



    public void select(WebElement element, String value){
        Select combo = new Select(element);
        combo.selectByValue(value);
    }
    public void selectCombo(WebElement element, String value1){
        //String value2,String value3
        Select combo = new Select(element);
        combo.selectByValue(value1);
//        combo.selectByValue(value2);
//        combo.selectByValue(value3);
    }
    public String ValidarText(WebElement element){
      return element.getText();
    }
    public void escrever(WebElement element, String text){
       element.clear();
       element.sendKeys(text);
    }

    public void clicar(WebElement element){
       element.click();
    }






}