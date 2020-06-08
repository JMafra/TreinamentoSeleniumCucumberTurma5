package stepdefs;


import actions.AmazonAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.InstanciarWebDriver;

public class AmazonStepDefs {		
	
	
	AmazonAction am;
	
	public AmazonStepDefs() {
		InstanciarWebDriver.getDriver();
		am = new AmazonAction(InstanciarWebDriver.getDriver());
		
	}
   
	@Given("eu abro o navegador")
	public void eu_abro_o_navegador() {
		InstanciarWebDriver.getDriver();
		am = new AmazonAction(InstanciarWebDriver.getDriver());
	}
	
	@And("acesso o site {string}")
	public void acesso_o_site(String url) {
		InstanciarWebDriver.getDriver().get(url);		
	}
	
	@And("realizo uma pesquisa por um produto")
	public void realizo_uma_pesquisa_por_um_produto() throws Exception {
	   am.preencherCampoPesquisa("celular");
	 // Thread.sleep(3000);
	   am.clicarBotaoPesquisar();
	}	
	
	@Then("seleciono um produto da lista")
	public void seleciono_um_produto_da_lista() throws Exception{
		Thread.sleep(2000);
	   am.selecionarProduto();
	}

	@Given("que especifico as caracteristicas do produto")
	public void que_especifico_as_caracteristicas_do_produto() {
	   am.selecionarCor();
	   am.selecionarQtde();
	}
	
	@And("adiciono o produto ao carrinho")
	public void adiciono_o_produto_ao_carrinho() {
	   am.adicionarProdutoCarrinho();
	}
	
	@Then("confirmo realizacao da compra")
	public void confirmo_realizacao_da_compra() throws Exception {
	   am.adicionarSeguroProtecao();
	   Thread.sleep(3000);
	   am.realizarCheckout();
	}	

}
