package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    //Criar o objeto do tipo ChromeDriver com nome driver
    ChromeDriver driver;

    @Before
    public void setUp() throws Exception {
        //Configurar a instancia do chromedriver
        WebDriverManager.chromedriver().setup();
        //Instanciar o objeto ChromeDriver
        driver = new ChromeDriver();
        //Maximiza o navegador
        driver.manage().window().maximize();
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");
    }

    @After
    public void tearDown() throws Exception {
        //Fechar o site e o navegador.
        driver.quit();
    }

    @Test
    public void testTituloPoqueTempoEConhecimento() {
        /*
        Inspecionado o titulo Tempo é conhecimento
        via copyXpath e armazenando num objeto do tipo String
         */
        String xpathTitleH4 = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        // Buscar o elemento web existente no xpath
        WebElement textTitle = driver.findElement(By.xpath(xpathTitleH4));
        //Armazenando num objeto do tipo String e capturar seu texto.
        String title = textTitle.getText();
        // Validando o texto do titulo da ChronosAcademy
        assertEquals("Porque Tempo É Conhecimento", title);
        System.out.println(title);

    }

    @Test
    public void testClickNoBotaoConhecaNossosCursos() {
        /*
        Inspecionado o texto do botão - Conheça Nossos Cursos
        via copyXpath e armazenando num objeto do tipo String
         */
        String xpathLinkSpan = "Conheça Nossos Cursos";
        // Identificando o elemento Web pelo LinkText - Texto do botão
        WebElement span = driver.findElement(By.linkText(xpathLinkSpan));
        //void - Como não retorna nada, Ação de clique
        span.click();

        // Identificando o elemento Web pelo Xpath - Texto da div
        String xpathTitleDiv = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        // Buscar o elemento web existente no xpath
        WebElement div = driver.findElement(By.xpath(xpathTitleDiv));
        //Armazenando num objeto do tipo String e capturar seu texto.
        String textDiv = div.getText();
        // Validando o texto do botão "Conheça todos os nossos cursos" da chronos academy
        assertEquals("Conheça todos os nossos cursos", textDiv);
        System.out.println(textDiv);

    }
}
