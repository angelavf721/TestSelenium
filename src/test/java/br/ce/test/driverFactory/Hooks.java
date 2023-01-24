package br.ce.test.driverFactory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Hooks {
    public static WebDriver driver;

    public static void iniciarDriver() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void fecharDriver() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void abrirUrl(String url) {
        driver.get(url);
    }
}
