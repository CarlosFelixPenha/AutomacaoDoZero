package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.DragAndDropPage;
import Pages.HomePage;

public class DragAndDrop {

	static WebDriver driver;
	static HomePage homePage;
	static DragAndDropPage dragAndDropPage;
	
	
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
			homePage.clicarBotaoComecarAutomacaoWeb(); 
			dragAndDropPage = new DragAndDropPage (driver);
			 
		}

	@Test
	public void testBuscaDeElementosCheckBox() throws InterruptedException {
		    // Chamando os steps
			dragAndDropPage.clicarIteracoesDragAndDrops();
			dragAndDropPage.clicarLinkDragAndDrops();
			dragAndDropPage.arrastarImagemDragAndDrops();
			dragAndDropPage.clicarBotaoVoltarDrag();
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		}

}
