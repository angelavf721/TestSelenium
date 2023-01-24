#language: pt
@cenario
Funcionalidade: Cadastro de Usuario
  Como usuário
  Eu quero cadastrar meu veiculo
  Para manter meu veiculo seguro

  Contexto: Dados do user
    Dado que estou na aplicação
    Quando completo os dados do veículo

    Esquema do Cenario: Dados do usuario
    Quando informo o nome "<nome>"
    E informo o Sobrenome "<sobrenome>"
    E informo a "<data>" de nascimento
    E seleciono o genero
    E informo o endereço "<endereco>"
    E seleciono o país
    E informo o codigo postal "<codigo>"
    E informo a cidade "<cidade>"
    E seleciono a ocupação
    E seleciono os hobbies
    E informo o "<site>"
    # E seleciono o cenario


    Exemplos:
    |      nome        ||      sobrenome     ||      data      ||      endereco    ||       codigo      ||       cidade         ||     site        |
    |       Ana333     ||      Ferreira85    ||   01/19/2023   ||      Qnm         ||    125850rerte    ||   Taguatinga88       ||   batata        |
    |   Ana Ferreira   ||  Ferreira Freitas  ||    1/9/2525    ||    Qn4*//*/*     ||    1258/*/*/      ||   frtgrhr455455*//*  ||   batata.com.br |
    |   AnaFerreira    ||  FerreiraFreitas   ||    41/89/2525  ||      78          ||    125850555555   ||   frtgrhr455455      ||   batata.co.    |
    |   AnaFerreira88  ||  FerreiraFreitas78 ||    131520000   ||     7785         ||    85khg/5555     ||  plou87694+.+*-      ||  http//batata.co|
    |       Ana        ||      Ferreira      ||   01/19/1999   ||    Qnm 40 C 15   ||      125850       ||   Taguatinga         ||   batata.com    |
