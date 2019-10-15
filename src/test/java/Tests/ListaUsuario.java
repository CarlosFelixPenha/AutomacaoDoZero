package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Pages.ListaUsuarioPage;

public class ListaUsuario {

	static WebDriver driver;
	static ListaUsuarioPage listaUsuarioPage;
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
			listaUsuarioPage = new ListaUsuarioPage (driver);
			homePage.clicarBotaoComecarAutomacaoWeb();
                
			}

	@Test
	public void testBuscaListaUsuario() throws InterruptedException {
		    // Chamando os steps
			listaUsuarioPage.clicarFormularioListaDeUsuarios();
			listaUsuarioPage.clicarLinkListaDeUsuarios();
			listaUsuarioPage.clicarBotaoVoltarListaDeUsuario();
			
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		
	}

}
