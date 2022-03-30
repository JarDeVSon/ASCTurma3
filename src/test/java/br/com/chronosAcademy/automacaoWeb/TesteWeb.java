package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    @Test
    public void primeiroTeste() {
        //Configurar a instancia do chromedriver
        WebDriverManager.chromedriver().setup();
        //Criar o objeto do tipo ChromeDriver com nome driver
        ChromeDriver driver;
        //Instanciar o objeto ChromeDriver
        driver = new ChromeDriver();
        //Maximiza o navegador
        driver.manage().window().maximize();
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");
        /*
        Inspecionado o titulo Tempo é conhecimento
        via copyXpath e armazenando num objeto do tipo String
         */
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        // Identificando o elemento Web pelo Xpath
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        // Capturando o texto do elemento web existente no xpath
        // e armazenando num objeto do tipo String
        String titulo = txtTitulo.getText();
        // Validando o texto do titulo da ChronosAcademy
        assertEquals("Porque Tempo É Conhecimento",titulo);
        //Fechar o site e o navegador.
        driver.quit();
    }
}
