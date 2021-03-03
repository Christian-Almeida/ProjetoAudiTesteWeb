#language:pt
#encoding: UTF-8

Funcionalidade: Menu
  Esquema do Cenario: Acessar Menu
    Dado que esteja na home da pagina
    Quando eu clico no Menu e escolho <titulo>
    Entao deve ir para <url> e mostrar <texto>
      Exemplos:
        | titulo                            | url                                                                 |texto                                  |
        |"Testes Automatizados"             |"https://auditeste.com.br/servicos/testes-automatizados/"            |"//TESTES AUTOMATIZADOS"               |
        |"Testes Funcionais Não Funcionais" |"https://auditeste.com.br/servicos/testes-funcionais-nao-funcionais/"|"//TESTES FUNCIONAIS NÃO FUNCIONAIS"   |
        |"Testes Manuais"                   |"https://auditeste.com.br/servicos/testes-manuais/"                  |"//TESTES MANUAIS"                     |
        |"Testes Mobile"                    |"https://auditeste.com.br/servicos/testes-mobile/"                   |"//TESTES MOBILE"                      |
        |"Fábrica de Testes"                |"https://auditeste.com.br/servicos/testes-fabrica/"                  |"//FÁBRICA DE TESTES"                  |
        |"Consultoria"                      |"https://auditeste.com.br/servicos/testes-consultoria/"              |"//CONSULTORIA"                        |
        |"Crowdsourced Auditeste"           |"https://auditeste.com.br/servicos/crowdsourced-auditeste/"          |"//CROWDSOURCED AUDITESTE"             |
        |"Alocação de Profissionais"        |"https://auditeste.com.br/servicos/teste-alocacao/"                  |"//ALOCAÇÃO DE PROFISSIONAIS"          |
        |"Automação de Processos"           |"https://auditeste.com.br/servicos/automacao-de-processos/"          |"//AUTOMAÇÃO DE PROCESSOS"             |