# language: pt
Funcionalidade: Calculadora do Windows

@caminho_feliz
  Esquema do Cenario: Calculos corretos
    Dado que eu abro a calculadora
    Quando eu realizar uma '<operacoes>' e ver o resultado correto
    Entao o resultado devera ser apagado

    Exemplos: 
      | operacoes     |
      | multiplicacao |
      | adicao        |
      | subtracao     |
      | divisao       |
      | raiz          |
      | potencia      |
      | porcentagem   |


@fluxo_alternativo
  Esquema do Cenario: Calculos incorretos
    Dado que eu abro a calculadora
    Quando eu realizar uma '<operacoes_inv>' invalida e ver o resultado final
    Entao o resultado devera ser apagado

    Exemplos: 
      | operacoes_inv          |
      | divisao por zero       |
      | raiz de num negativo   |
      | inserir muitos numeros |
