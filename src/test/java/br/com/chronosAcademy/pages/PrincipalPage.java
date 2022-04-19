package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }

    public String getTituloTempoEConhecimento() {
        // Buscar o elemento web existente no xpath
        //Armazenando num objeto do tipo String e capturar seu texto.
        return principalMap.textTitleH4.getText();
    }

    public void clickBotaoConhecaNossosCursos() {
        principalMap.textLinkDiv.click();
    }
}
