package br.com.chronosAcademy.media;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MediaTest {

    Media media;

    @BeforeEach
    void setUp() {
        media = new Media();
    }
    @Test
    void validaAprovado() {
       assertEquals("Aprovado",media.calculaMedia(5.0,5.0));
    }
    @Test
    void validaReprovado() {
        assertEquals("Reprovado", media.calculaMedia(5.0,4.9));
    }
}