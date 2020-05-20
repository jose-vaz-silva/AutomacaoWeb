$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CT01.feature");
formatter.feature({
  "line": 1,
  "name": "Comprar produto",
  "description": "",
  "id": "comprar-produto",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "CT01- Adcionar produto no carrinho",
  "description": "",
  "id": "comprar-produto;ct01--adcionar-produto-no-carrinho",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que ao acessar o portal \"https://www.americanas.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquisar o produto \"SSD 240gb\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "acessar o produto \"SSD Kingston A400 240GB\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clicar em comprar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "produto \"SSD Kingston A400 240GB\" adicionado ao carrinho",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.americanas.com.br",
      "offset": 25
    }
  ],
  "location": "CT01.que_ao_acessar_o_sistema(String)"
});
formatter.result({
  "duration": 28875230400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD 240gb",
      "offset": 21
    }
  ],
  "location": "CT01.pesquisar_o_produto(String)"
});
formatter.result({
  "duration": 6924071300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD Kingston A400 240GB",
      "offset": 19
    }
  ],
  "location": "CT01.acessar_o_produto(String)"
});
formatter.result({
  "duration": 2557931500,
  "status": "passed"
});
formatter.match({
  "location": "CT01.clicar_em_comprar()"
});
formatter.result({
  "duration": 2656244000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD Kingston A400 240GB",
      "offset": 9
    }
  ],
  "location": "CT01.produto_adicionado_ao_carrinho(String)"
});
formatter.result({
  "duration": 2334183400,
  "status": "passed"
});
formatter.after({
  "duration": 3362620800,
  "status": "passed"
});
});