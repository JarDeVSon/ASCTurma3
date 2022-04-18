package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteWeb {
    //Criar o objeto do tipo ChromeDriver com nome driver
    ChromeDriver driver;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @BeforeEach
    public void setUp() {
        //Configurar a instancia do chromedriver
        WebDriverManager.chromedriver().setup();
        //Instanciar o objeto ChromeDriver
        driver = new ChromeDriver();
        principalPage = new PrincipalPage(driver);
        cursoPage = new CursoPage(driver);
        //Maximiza o navegador
        driver.manage().window().maximize();
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");
    }



    @Test
    @DisplayName("Teste Titulo da ChronosAcademy")
    public void testTituloPoqueTempoEConhecimento() {
        // Validando o texto do titulo da ChronosAcademy
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTitle());
        System.out.println(principalPage.getTitle());

    }


    @Test
    public void testClickNoBotaoConhecaNossosCursos() {
        principalPage.clickBotaoConhecaNossosCursos();
        // Validando o texto do botão "Conheça todos os nossos cursos" da chronos academy
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTextDiv());
        System.out.println(cursoPage.getTextDiv());

    }



    @AfterEach
    public void tearDown() throws Exception {
        //Fechar o site e o navegador.
        driver.quit();
    }
}
