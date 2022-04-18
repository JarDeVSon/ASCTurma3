package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    //Criar o objeto do tipo ChromeDriver com nome driver
    ChromeDriver driver;
    PrincipalPage principalPage;

    @BeforeEach
    @DisplayName("Setup - Antes de iniciar cada cenário de testes")
    public void setUp() {
        //Configurar a Inicialização do chromedriver
        WebDriverManager.chromedriver().setup();
        //Inicializar o objeto ChromeDriver
        driver = new ChromeDriver();
        //Maximiza o navegador
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        principalPage = new PrincipalPage(driver);
        //Abrir o site da Chronos
        driver.get("https://www.chronosacademy.com.br");

    }

    @Test
    @DisplayName("Validar titulo da ChronosAcademy - Porque Tempo É Conhecimento")
    public void testTituloDaChronosAcademy() {
        // Validando o texto do titulo da ChronosAcademy
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTituloDaChronosAcademy());
        System.out.println(principalPage.getTituloDaChronosAcademy());
    }

    @AfterEach
    @DisplayName("Setup - Depois de encerrar cada cenário de testes")
    public void tearDown() {
        //Fechar o site e o navegador.
        driver.quit();
    }
}
