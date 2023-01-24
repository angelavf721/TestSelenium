package br.ce.test.steps;

import br.ce.test.pages.ProdutoPage;
import br.ce.test.pages.SeguroPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ProdutoStep {

    ProdutoPage produto = new ProdutoPage();
    SeguroPage seguro = new SeguroPage();
    @E("seleciono o valor do seguro")
    public void selecionoOValorDoSeguro() {
        produto.setSoma();
    }

    @Quando("informo a data de início")
    public void informoADeInício() {
        produto.setData();
    }

    @E("seleciono a avaliação")
    public void selecionoAAvaliação() {
        produto.setAvaliacao();
    }

    @E("seleciono o seguro de danos")
    public void selecionoOSeguroDeDanos() {
        produto.setDanos();
    }

    @E("seleciono os produtos Opcionais")
    public void selecionoOsProdutosOpcionais() {
        produto.setProdutos();
    }
    @E("seleciono o carro de cortesia")
    public void selecionoOCarroDeCortesia() {
        produto.setCarro();
    }
    @Então("vou para outra pagina")
    public void vouParaOutraPagina() {
        produto.setProximo();
    }


    @E("completo formulario do seguro")
    public void completoFormularioDoSeguro() {
        seguro.cadastroSeguro();
    }

    @E("completo formulario do produto")
    public void completoFormularioDoProduto() {
        produto.cadastroProduto();
    }


}
