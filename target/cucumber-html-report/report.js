$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CT02.feature");
formatter.feature({
  "line": 1,
  "name": "Comprar produto2",
  "description": "",
  "id": "comprar-produto2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "CT02- Adcionar produto no carrinho",
  "description": "",
  "id": "comprar-produto2;ct02--adcionar-produto-no-carrinho",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que ao acessar o portal2 \"https://www.americanas.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquisar o produto2 \"SSD 240gb\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "acessar o produto2 \"SSD Kingston A400 240GB\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clicar em comprar2",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "produto2 \"SSD Kingston A400 240GB\" adicionado ao carrinho",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.americanas.com.br",
      "offset": 26
    }
  ],
  "location": "CT02.que_ao_acessar_o_sistema(String)"
});
formatter.result({
  "duration": 33261063500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD 240gb",
      "offset": 22
    }
  ],
  "location": "CT02.pesquisar_o_produto(String)"
});
formatter.result({
  "duration": 33953246900,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //div[@data-tracker\u003d\"searchquery-main\"]//h1 (tried for 30 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat page.BasePage.getWebElement(BasePage.java:72)\r\n\tat page.BasePage.getTextElement(BasePage.java:115)\r\n\tat page.HomePage.getProductSearched(HomePage.java:27)\r\n\tat steps.CT02.pesquisar_o_produto(CT02.java:30)\r\n\tat ✽.When pesquisar o produto2 \"SSD 240gb\"(src/test/resources/features/CT02.feature:4)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //div[@data-tracker\u003d\"searchquery-main\"]//h1\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027UDI-DCK8703\u0027, ip: \u0027192.168.0.240\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:883)\r\n\tat java.util.Optional.orElseThrow(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:882)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat page.BasePage.getWebElement(BasePage.java:72)\r\n\tat page.BasePage.getTextElement(BasePage.java:115)\r\n\tat page.HomePage.getProductSearched(HomePage.java:27)\r\n\tat steps.CT02.pesquisar_o_produto(CT02.java:30)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:39)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Iterator.forEachRemaining(Unknown Source)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEach(Unknown Source)\r\n\tat org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:79)\r\n\tat org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:70)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)\r\n\tat org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD Kingston A400 240GB",
      "offset": 20
    }
  ],
  "location": "CT02.acessar_o_produto(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CT02.clicar_em_comprar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SSD Kingston A400 240GB",
      "offset": 10
    }
  ],
  "location": "CT02.produto_adicionado_ao_carrinho(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2484712600,
  "status": "passed"
});
});