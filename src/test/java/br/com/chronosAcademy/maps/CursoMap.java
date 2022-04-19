package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursoMap {

    @FindBy(xpath = "//*[text()='Conheça todos os nossos cursos']")
    public WebElement textTitleDiv;

    @FindBy(xpath = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div")
    public WebElement textDiv;

}
