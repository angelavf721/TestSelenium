package br.ce.test.steps;

import br.ce.test.pages.SeguroPage;
import br.ce.test.pages.VeicolosPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class SeguroStep {
    SeguroPage  seguro = new SeguroPage();
    VeicolosPage pageV = new VeicolosPage();
    @Quando("informo o nome {string}")
    public void informoONome(String arg0) {
        seguro.setNome(arg0);
    }

    @E("informo o Sobrenome {string}")
    public void informoOSobrenome(String arg0) {
        seguro.setSobrenome(arg0);
    }

    @E("informo a {string} de nascimento")
    public void informoADeNascimento(String arg0) {
        seguro.setDataN(arg0);
    }

    @E("seleciono o genero")
    public void selecionoOGenero() {
        seguro.setGenero();
    }

    @E("informo o endereço {string}")
    public void informoOEndereço(String arg0) {
        seguro.setEndereco(arg0);
    }

    @E("seleciono o país")
    public void selecionoOPaís() {
        seguro.setPais();
    }

    @E("informo o codigo postal {string}")
    public void informoOCodigoPostal(String arg0) {
        seguro.setCodigo(arg0);
    }

    @E("informo a cidade {string}")
    public void informoACidade(String arg0) {
        seguro.setCidade(arg0);
    }

    @E("seleciono a ocupação")
    public void selecionoAOcupação() {
        seguro.setOcupacao();
    }

    @E("seleciono os hobbies")
    public void selecionoOsHobbies() {
        seguro.setHobbis();
    }

    @E("informo o {string}")
    public void informoO(String arg0) {
        seguro.setWeb(arg0);
    }

    @E("seleciono o cenario")
    public void selecionoOCenario() {
        //seguro.setCenario();
    }

    @Então("seleciono next")
    public void selecionoNext() {
        seguro.setNext();
    }

    @Quando("completo os dados do veículo")
    public void completoOsDadosDoVeículo() {
        pageV.cadastroVeiculos();
    }


}
