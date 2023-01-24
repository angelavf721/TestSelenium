#language: pt
@cenario
Funcionalidade: Cadastro do Produto
  Como usuário
  Eu quero cadastrar meu veiculo
  Para manter meu veiculo seguro

  Contexto: Dados do Produto
    Dado que estou na aplicação
    Quando completo os dados do veículo
    E completo formulario do seguro

  Cenario: Dados do produto
    E informo a data de início
    E seleciono o valor do seguro
    E seleciono a avaliação
    E seleciono o seguro de danos
    E seleciono os produtos Opcionais
    E seleciono o carro de cortesia
    Então vou para outra pagina

