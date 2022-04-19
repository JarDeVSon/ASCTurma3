package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @BeforeEach
    public void setUp() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        principalPage = new PrincipalPage(driver);
        cursoPage = new CursoPage(driver);
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");

    }


    @Test
    @DisplayName("Teste Titulo da ChronosAcademy")
    public void testTituloPoqueTempoEConhecimento() {

        assertEquals("Porque Tempo É Conhecimento", principalPage.getTitle());
        System.out.println(principalPage.getTitle());

    }


    @Test
    public void testClickNoBotaoConhecaNossosCursos() {

        cursoPage = new CursoPage(driver);

        principalPage.clickBotaoConhecaNossosCursos();
        // Validando o texto do botão "Conheça todos os nossos cursos" da chronos academy

        assertEquals("Conheça todos os nossos cursos", cursoPage.getTextDiv());
        System.out.println(cursoPage.getTextDiv());

    }


    @AfterEach
    public void tearDown() {
        //Fechar o site e o navegador.
        driver.quit();
    }

}
