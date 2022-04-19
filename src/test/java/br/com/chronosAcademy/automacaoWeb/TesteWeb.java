package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    //Criar o objeto do tipo ChromeDriver com nome driver
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void setUp() {
        driverWeb = new Driver("chrome");
        //Instanciar o objeto ChromeDriver
        driver = driverWeb.getDriver();
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @After
    public void tearDown() {
        //Fechar o site e o navegador.
        driver.quit();
    }

    @Test
    public void testTituloPoqueTempoEConhecimento() {
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTituloTempoEConhecimento());
        System.out.println(principalPage.getTituloTempoEConhecimento());

    }


    @Test
    public void testClickNoBotaoConhecaNossosCursos() {

        principalPage.clickBotaoConhecaNossosCursos();
        cursoPage = new CursoPage(driver);
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTextDiv());
        System.out.println(cursoPage.getTextDiv());

    }


}
