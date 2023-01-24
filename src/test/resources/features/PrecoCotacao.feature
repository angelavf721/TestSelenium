#language: pt
@cenario
  Funcionalidade: Seleção de preco e cotação
    Como usuário
    Eu quero escolher meu plano e cotação
    Para manter meu veiculo seguro

  Contexto:
    Dado que estou na aplicação
    Quando completo os dados do veículo
    E completo formulario do seguro
    E completo formulario do produto

  Cenario: Selecionar preço
    E seleciono o tipo de plano
    E vou para proxima pagina

  Cenario: Enviar cotação
    E seleciono o plano
    E informo o E-mail "davi@davi.com"
    E informo o telefone "784512963"
    E informo o Nome  "Davitu"
    E informo a senha "Lasanha88"
    E informo a confirmação da senha "Lasanha88"
    E coloco um comentario "Um texto aqui"
    Então recebo a mensagem de confirmação