package actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AmazonPage;


public class AmazonAction extends AmazonPage{	
	
	WebDriverWait wait;
	
	public AmazonAction(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);		
		
	}
		
	public void preencherCampoPesquisa(String valor) {	
		wait.until(ExpectedConditions.visibilityOf(campoBusca)).sendKeys(valor);		
	}
	
	
	public void  clicarBotaoPesquisar() {
		wait.until(ExpectedConditions.visibilityOf(btPesquisa)).click();		
	}
	
	public void selecionarProduto() {
		wait.until(ExpectedConditions.visibilityOf(linkProduto)).click();		
	}
	
	public void selecionarCor() {
		wait.until(ExpectedConditions.visibilityOf(corProduto)).click();	
	}
	
	public void selecionarQtde() {
		Select combo = new Select(qtdProduto);
		combo.selectByVisibleText("2");
	}	
	
	public void adicionarProdutoCarrinho() {
		wait.until(ExpectedConditions.visibilityOf(btAdicionarCarrinho)).click();		
	}
	
	public void adicionarSeguroProtecao() {	
		
		for(WebElement item : itensJanelaSeguro)
		{
			if (item.getText().contains("No Thanks")){
				item.click();
			}		
		}		
		
	}
	
	public void realizarCheckout() {	
		btCheckout.click();
		
	}	

}
