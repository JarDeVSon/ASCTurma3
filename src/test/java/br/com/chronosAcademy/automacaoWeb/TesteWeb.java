package br.com.chronosAcademy.automacaoWeb;

<<<<<<< HEAD
import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
=======
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteWeb {
    //Criar o objeto do tipo ChromeDriver com nome driver
<<<<<<< HEAD
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void setUp() {
        driverWeb = new Driver("chrome");
        //Instanciar o objeto ChromeDriver
        driver = driverWeb.getDriver();
=======
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
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

<<<<<<< HEAD
    @After
    public void tearDown() {
        //Fechar o site e o navegador.
        driver.quit();
    }
=======

>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f

    @Test
    @DisplayName("Teste Titulo da ChronosAcademy")
    public void testTituloPoqueTempoEConhecimento() {
<<<<<<< HEAD
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTituloTempoEConhecimento());
        System.out.println(principalPage.getTituloTempoEConhecimento());
=======
        // Validando o texto do titulo da ChronosAcademy
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTitle());
        System.out.println(principalPage.getTitle());
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f

    }


    @Test
    public void testClickNoBotaoConhecaNossosCursos() {
<<<<<<< HEAD

        principalPage.clickBotaoConhecaNossosCursos();
        cursoPage = new CursoPage(driver);
=======
        principalPage.clickBotaoConhecaNossosCursos();
        // Validando o texto do botão "Conheça todos os nossos cursos" da chronos academy
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTextDiv());
        System.out.println(cursoPage.getTextDiv());

    }


<<<<<<< HEAD
=======

    @AfterEach
    public void tearDown(){
        //Fechar o site e o navegador.
        driver.quit();
    }
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f
}
