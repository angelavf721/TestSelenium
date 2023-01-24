#language: pt
@cenario
Funcionalidade: Cadastro de Veiculos
  Como usuário
  Eu quero cadastrar meu veiculo
  Para manter meu veiculo seguro

  Contexto: Dados
    Dado que estou na aplicação

    Esquema do Cenario: Dados do veiculo
    Quando seleciono a marca do veiculo
    E seleciono o modelo
    E informo a capacidade do cilindro "<ccm>"
    E informo  o desempenho do motor "<km>"
    E informo a "<data>"
    E seleciono o número de assentos
    E seleciono a direção do volante
    E seleciono a quantidade de assentos
    E seleciono o tipo de combustivel
    E informo a capacidade da "<carga>"
    E informo o peso "<peso>"
    E informo o preço de tabela "<valorTabela>"
    E informo o numero da placa "<placa>"
    E informo a quilometragem "<mi>"


    Exemplos:
    |      ccm      ||      km      ||      data      ||      carga    ||     peso    ||    valorTabela    ||       placa       ||     mi        |
    |   777777      ||    555555    ||   55555526     ||    4448888    ||   78008888  ||        5000000    ||   5654654646858   ||   888888585   |
    |     romeu     ||     ana      ||   444/55/55    ||     dog       ||    torta    ||        algo       ||   mkdkg455dgte5   || fdsjsdfhhhhhh |
    |    45ccm      ||    555km     ||   14/14/2019   ||      67kg     ||    1001kg   ||       1000$       ||      jdhd52rt#$   ||     258mi     |
    |       45      ||      555     ||   01/19/2023   ||       444     ||     120     ||        5000       ||   5654654646      ||    88888      |
