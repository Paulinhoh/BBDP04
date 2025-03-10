package edu.paulinhoh.desafio.projeto.src;

import edu.paulinhoh.desafio.projeto.src.domain.Iphone;

public class Main {

    public static void main(String[] args) {
        var iPhone = new Iphone();

        // Reprodutor Musical
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("");

        // Telefone
        iPhone.atender();
        iPhone.ligar("75998836581");
        iPhone.iniciarCorreioVoz();

        System.out.println("");

        // Navegador
        iPhone.novaAba();
        iPhone.exibirPagina("google.com");
        iPhone.atualizarPagina();

    }
}
