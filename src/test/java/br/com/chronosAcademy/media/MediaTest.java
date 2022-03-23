package br.com.chronosAcademy.media;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediaTest {

    @Test
    public void testValidarAprovado() {
        // Arrange
        Media media = new Media();
        // Act,
        String resultado = media.calcularMedia(5.00, 5.00);
        // Assert
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void testValidarReprovado() {
        // Arrange
        Media media = new Media();
        //Act,
        String resultado = media.calcularMedia(4.9, 5.0);
        // Assert
        assertEquals("Reprovado", resultado);
    }

}