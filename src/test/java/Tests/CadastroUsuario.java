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
	public void testClicarFormularioCriarUsuarios() throws InterruptedException {
		    // Chamando o step
			cadastroUsuarioPage.clicarFormularioCriarUsuarios();
		}
	
	@Test
	public void testClicarLinkCriarUsuarios() throws InterruptedException {
		    // Chamando o step
			cadastroUsuarioPage.clicarLinkCriarUsuarios();
		}
	
	@Test
	public void testEditarCampoNome() throws InterruptedException {
		    // Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoNome();
		}
	
	@Test
	public void testEditarCampoSobrenome() throws InterruptedException {
		    // Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoSobrenome();
		}
	
	@Test
	public void testEditarCampoEmail() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoEmail();
		}
	
	@Test
	public void testEditarCampoEndereco() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoEndereco();
		}
	
	@Test
	public void testEditarCampoUniversidade() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoUniversidade();
		}
	
	@Test
	public void testEditarCampoProfissao() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoProfissao();
		}
	
	@Test
	public void testEditarCampoGenero() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoGenero();
		}
	
	@Test
	public void testEditarCampoIdade() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.editarCampoIdade();
		}
	
	@Test
	public void testClicarBotaoCriar() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.clicarBotaoCriar();
		}
	
//	@Test
//	public void testMensagemSucesso() throws InterruptedException {
//		// Chamando o step "Metodo"
////		cadastroUsuarioPage.clicarBotaoCriar();
//		assertEquals(cadastroUsuarioPage.mensagemSucesso(), "Usuário Criado com sucesso");
//
//		}
//	
	@Test
	public void testClicarBotaoVoltarCriarUsuario() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.clicarBotaoVoltarCriarUsuario();
		}

	@Test
	public void testClicarBotaoVoltarUsuario() throws InterruptedException {
			// Chamando o step "Metodo"
			cadastroUsuarioPage.clicarBotaoVoltarUsuario();
		}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
		       driver.close();
		
	}

}


