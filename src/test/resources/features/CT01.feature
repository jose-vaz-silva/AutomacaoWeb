Feature: Comprar produto
  Scenario: CT01- Adcionar produto no carrinho
    Given que ao acessar o portal "https://www.americanas.com.br"
    When pesquisar o produto "SSD 240gb"
    And acessar o produto "SSD Kingston A400 240GB"
    And clicar em comprar
    Then produto "SSD Kingston A400 240GB" adicionado ao carrinho