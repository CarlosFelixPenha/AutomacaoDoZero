package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Pages.ImputsPage;

public class Imputs {

	static WebDriver driver;
	static ImputsPage imputsPage;
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
			imputsPage = new ImputsPage (driver);
			homePage.clicarBotaoComecarAutomacaoWeb();
                
		}

	@Test
	public void testBuscaDeElementosImputs() throws InterruptedException {
		    // Chamando os steps
			imputsPage.clicarBuscaDeElementosImputs();
			imputsPage.clicarImputsTextField();
			imputsPage.clicarCampoFirstName();
			imputsPage.clicarCampoLastName();
			imputsPage.clicarCampoTextArea();
			imputsPage.clicarBotaoVoltaImputs();
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		}

}
