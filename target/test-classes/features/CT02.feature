Feature: Comprar produto2
  Scenario: CT02- Adcionar produto no carrinho
    Given que ao acessar o portal2 "https://www.americanas.com.br"
    When pesquisar o produto2 "SSD 240gb"
    And acessar o produto2 "SSD Kingston A400 240GB"
    And clicar em comprar2
    Then produto2 "SSD Kingston A400 240GB" adicionado ao carrinho