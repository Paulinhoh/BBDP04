package edu.paulinhoh.desafio.projeto.src.domain;

public class Iphone implements ReprodutorMusial, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o Celular...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina... " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo novo Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
