package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.CursoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap;
<<<<<<< HEAD

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String getTextDiv() {
        //Armazenando num objeto do tipo String e capturar seu texto.
        return cursoMap.textTitleDiv.getText();
=======
    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver,cursoMap);
    }


    public String getTextDiv() {
        return cursoMap.textDiv.getText();
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f
    }
}
