Feature: Comprar produto
  Scenario: CT01- Adcionar produto no carrinho
    Given que ao acessar o portal "https://www.americanas.com.br"
    When pesquisar o produto "SSD Kingston A400 480GB"
    And acessar o produto "SSD Kingston A400 480GB"
    And clicar em comprar
    Then produto "Ssd Kingston A400 480gb" adicionado ao carrinho
    
    Scenario: Adcionar produto no carrinho
    Given que ao acessar o portal "https://www.americanas.com.br"
    When pesquisar o produto "SSD Kingston A400 480GB"
    And acessar o produto "SSD Kingston A400 480GB"
    And clicar em comprar
    Then produto "Ssd Kingston A400 480gb" adicionado ao carrinho