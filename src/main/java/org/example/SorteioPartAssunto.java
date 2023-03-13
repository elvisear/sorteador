package org.example;

import java.util.Random;

public class SorteioPartAssunto {
    private String[] participanteSorteado = {
            "ELVIS", "CHARLES", "LUCAS", "RODRIGO", "LUAN"
    };
    private String[] assunto = {
            "VARIÁVEIS", "TIPOS PRIMITIVOS", "CLASSES", "MÉTODOS"
    };
    public static void main(String[] args) {
        SorteioPartAssunto sorteio = new SorteioPartAssunto();
        String participante = sorteio.sortearParticipante();
        String assunto = sorteio.sortearAssunto();
        sorteio.exibirResultado(participante, assunto);
    }
    public String sortearParticipante() {
        Random r = new Random();
        int i = r.nextInt(participanteSorteado.length);
        return participanteSorteado[i];
    }
    public String sortearAssunto() {
        Random r = new Random();
        int i = r.nextInt(assunto.length);
        return assunto[i];
    }
    public void exibirResultado(String participante, String assunto) {
        System.out.println("Participante: " + participante);
        System.out.println("Assunto.....: " + assunto);
    }
}