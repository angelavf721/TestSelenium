package br.ce.test.steps;

import br.ce.test.pages.VeicolosPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static br.ce.test.driverFactory.Hooks.*;


public class VeiculosStep {

    VeicolosPage veiculos;
//    BasePage base;
    @Dado("que estou na aplicação")
    public void que_estou_na_aplicação() {
        iniciarDriver();
        abrirUrl("http://sampleapp.tricentis.com/101/app.php");
    }

    @Quando("seleciono a marca do veiculo")
    public void selecionoAMarcaDoVeiculo() {
        veiculos = new VeicolosPage();
//        base = new BasePage();
//        Assert.assertEquals("12", base.ValidarText());
        veiculos.Modizila();

    }
    @E("seleciono o modelo")
    public void selecionoOModelo() {
//        Assert.assertEquals("11", base.ValidarText());
        veiculos.modelo();
    }

    @E("informo  o desempenho do motor {string}")
    public void informoODesempenhoDoMotor(String arg0) {
    //    Assert.assertEquals("9", base.ValidarText());
        veiculos.quilometro(arg0);
    }

    @E("informo a capacidade do cilindro {string}")
    public void informoACapacidadeDoCilindro(String arg0) {
//        Assert.assertEquals("10", base.ValidarText());
        veiculos.cilindro(arg0);
    }

    @E("informo a {string}")
    public void informoA(String arg0) {
        veiculos.setDataS(arg0);
    }

    @E("seleciono o número de assentos")
    public void selecionoONúmeroDeAssentos() {
        veiculos.setAssentos();
    }

    @E("seleciono a direção do volante")
    public void selecionoADireçãoDoVolante() {
        veiculos.volante();
    }

    @E("seleciono a quantidade de assentos")
    public void selecionoAQuantidadeDeAssentos() {
        veiculos.setSeats();

    }
    @E("seleciono o tipo de combustivel")
    public void selecionoOTipoDeCombustivel() {
        veiculos.setCombustivel();
    }

    @E("informo a capacidade da {string}")
    public void informoACapacidadeDa(String arg0) {
        veiculos.setCarga(arg0);
    }

    @E("informo o peso {string}")
    public void informoOPeso(String arg0) {
        veiculos.setPeso(arg0);
    }
    @E("informo o preço de tabela {string}")
    public void informoOPreçoDeTabela(String arg0) {
        veiculos.setPreco(arg0);
    }

    @E("informo o numero da placa {string}")
    public void informoONumeroDaPlaca(String arg0) {
        veiculos.setPlaca(arg0);
    }

    @E("informo a quilometragem {string}")
    public void informoAQuilometragem(String arg0) {
        veiculos.setQuilometragem(arg0);
    }

    @Então("clico em next")
    public void clicoEmNext() {
        veiculos = new VeicolosPage();
        veiculos.nextPage();
    }

    @After
    public void End(){
    fecharDriver();
    }
}
