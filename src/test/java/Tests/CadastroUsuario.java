package Tests;

//import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CadastroUsuarioPage;
import Pages.HomePage;

public class CadastroUsuario {

	static WebDriver driver;
	static CadastroUsuarioPage cadastroUsuarioPage;
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
			cadastroUsuarioPage = new CadastroUsuarioPage (driver);
			homePage.clicarBotaoComecarAutomacaoWeb();
                
			}

	@Test
	public void testBuscaFormularioCriarUsuarios() throws InterruptedException {
		    // Chamando os steps
			cadastroUsuarioPage.clicarFormularioCriarUsuarios();
			cadastroUsuarioPage.clicarLinkCriarUsuarios();
			cadastroUsuarioPage.editarCampoNome();
			cadastroUsuarioPage.editarCampoSobrenome();
			cadastroUsuarioPage.editarCampoEmail();
			cadastroUsuarioPage.editarCampoEndereco();
			cadastroUsuarioPage.editarCampoUniversidade();
			cadastroUsuarioPage.editarCampoProfissao();
			cadastroUsuarioPage.editarCampoGenero();
			cadastroUsuarioPage.editarCampoIdade();
			cadastroUsuarioPage.clicarBotaoCriar();
			cadastroUsuarioPage.clicarBotaoVoltarCriarUsuario();
			cadastroUsuarioPage.clicarBotaoVoltarUsuario();
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		}

}


