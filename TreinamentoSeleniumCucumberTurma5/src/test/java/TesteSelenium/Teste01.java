package TesteSelenium;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AmazonPage;


public class Teste01 {
	
	/* static WebDriver driver;
	public static final String PATH_CHROMEDRIVER = new File("").getAbsolutePath() + "\\src\\main\\java\\resources\\chromedriver.exe";
	
	 
	 @Test
	 public void testAmazon() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.br/"); 
		WebDriverWait wait = new WebDriverWait(driver, 30);
				
		AmazonPage amazon = new AmazonPage(driver);
		wait.until(ExpectedConditions.visibilityOf(amazon.getCampoBusca())).sendKeys("carregador portatil");
		wait.until(ExpectedConditions.elementToBeClickable(amazon.getBtPesquisa())).click();
		 
	 }	 */
	
	

}
