package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Pages.LinksPage;

public class Links {

	static WebDriver driver;
	static LinksPage linksPage;
	static HomePage homePage;
	
		@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			// Mostrar onde se encontra o executavél do Chrome
			System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			// Abrindo o Browser
			driver.get("https://automacaocombatista.herokuapp.com/");
			driver.manage() .window() .maximize();
			// Chamando as paginas
			homePage = new HomePage (driver);
			linksPage = new LinksPage (driver);
			homePage.clicarBotaoComecarAutomacaoWeb();
                
			}

	@Test
	public void testBuscaDeElementosLinks() throws InterruptedException {
		    // Chamando os steps
			linksPage.clicarBuscaDeElementosLinks();
			linksPage.clicarLinks();
			linksPage.clicarLinkSucesso();
			linksPage.clicarBotaoVoltarSucesso();
			linksPage.clicarBotaoVoltarLinks();
			
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		
	}

}
