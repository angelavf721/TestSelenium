package br.ce.test.steps;

import br.ce.test.pages.PrecoCotacaoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class PrecoCotacaoStep {

    PrecoCotacaoPage page;

    @E("seleciono o tipo de plano")
    public void selecionoOTipoDePlano() {
        page = new PrecoCotacaoPage();
        page.setGold();
    }
    @E("vou para proxima pagina")
    public void vouParaProximaPagina() {
        page = new PrecoCotacaoPage();
        page.setNext();
    }

    @E("informo o E-mail {string}")
    public void informoOEMail(String arg0) {
        page.setEmail(arg0);
    }

    @E("informo o telefone {string}")
    public void informoOTelefone(String arg0) {
        page.setTelefone(arg0);
    }

    @E("informo o Nome  {string}")
    public void informoONome(String arg0) {
        page.setUser(arg0);
    }

    @E("informo a senha {string}")
    public void informoASenha(String arg0) {
        page.setSenha(arg0);
    }

    @E("informo a confirmação da senha {string}")
    public void informoAConfirmaçãoDaSenha(String arg0) {
        page.setConfSenha(arg0);
    }

    @E("coloco um comentario {string}")
    public void colocoUmComentario(String arg0) {
        page.setComents(arg0);
    }

    @E("seleciono o plano")
    public void selecionoOPlano() {
        page = new PrecoCotacaoPage();
        page.select();
    }

    @Então("recebo a mensagem de confirmação")
    public void receboAMensagemDeConfirmação() {
        page.alert();
    }

}
