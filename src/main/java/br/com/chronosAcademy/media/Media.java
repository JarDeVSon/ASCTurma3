package br.com.chronosAcademy.media;

public class Media {

    public String calcularMedia(double primeiroValor, double segundoValor) {
       double media = (primeiroValor + segundoValor)/2;
       if (media < 5){
            return "Reprovado";
        }
       return "Aprovado";
    }
}
