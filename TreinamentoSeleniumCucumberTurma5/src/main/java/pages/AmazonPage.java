package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class AmazonPage {	
	
	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="twotabsearchtextbox" )
	protected WebElement campoBusca;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"nav-search\"]/form/div[2]/div/input")
    protected WebElement btPesquisa;
	
	
	@FindBy(how=How.XPATH, using= "//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'Samsung Galaxy S7 G930A 32GB Gold Platinum - Unlocked GSM (Renewed)')]")
	protected WebElement linkProduto;
	
	
	@FindBy(how = How.ID, using="color_name_2")
	protected WebElement corProduto;
	
	@FindBy(how = How.ID, using="quantity")
	protected WebElement qtdProduto;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"attachSiNoCoverage-announce\"]")  
	protected WebElement btAdicionarSeguro;
	
	@FindBy(how=How.ID, using="add-to-cart-button")
	protected WebElement btAdicionarCarrinho;
	
	@FindBy(how=How.ID, using="attach-desktop-sideSheet")
	protected List<WebElement> itensJanelaSeguro; 
	
	@FindBy(how=How.XPATH, using="//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	protected WebElement btCheckout; 
	

}
