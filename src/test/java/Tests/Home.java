package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

public class Home {

	static WebDriver driver;
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
			homePage = new HomePage(driver);
	}

	@Test
	public void testAbrirTelaHome() throws InterruptedException {
		    // Chamando os steps
			homePage.clicarBotaoComecarAutomacaoWeb();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
        // Fechando o Browser
		   driver.close();
	}

}
