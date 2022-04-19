package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

<<<<<<< HEAD
public class PrincipalMap {
    @FindBy(xpath = "//section[2]//h4")
    public WebElement textTitleH4;
    @FindBy(xpath = "//*[text()='Conheça Nossos Cursos']")
    public WebElement textLinkDiv;
=======


public class PrincipalMap {
    @FindBy(xpath = "//section[2]//h4") public WebElement textTitleH4;
    @FindBy(linkText = "Conheça Nossos Cursos") public WebElement linkTextSpan;
>>>>>>> 43ec821ab4ab7acba4cc0c1c51b5f55bcca6bb4f
}
