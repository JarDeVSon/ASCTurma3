package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursoMap {
    @FindBy(xpath = "//*[text()='Conheça todos os nossos cursos']")
    public WebElement textTitleDiv;

}
