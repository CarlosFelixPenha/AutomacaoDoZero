package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.CadastroUsuarioPage;
import Pages.ListaUsuarioPage;
import Pages.LinksPage;
import Pages.ImputsPage;
import Pages.BotoesPage;
import Pages.CheckBoxPage;
import Pages.DropdownPage;

//import Pages.AccordionPage;
//import Pages.AutoCompletePage;
//import Pages.BotoesPage;
//import Pages.CadastroUsuarioPage;
//import Pages.CheckBoxPage;
//import Pages.DatapickerPage;
//import Pages.DragAndDropPage;
//import Pages.LinksPage;
//import Pages.ListaUsuarioPage;
//import Pages.MousehoverPage;
//import Pages.MudarFocoPage;
//import Pages.ScrollPage;
//import Pages.TextosPage;
//import Pages.UploadArquivoPage;

// Instanciando as classes (WebDriver, Home, Cadastro, Lista, Links, etc...)
public class AutomacaoWeb {

	static WebDriver driver;
	static HomePage homePage;
	static CadastroUsuarioPage cadastroUsuarioPage;
	static ListaUsuarioPage listaUsuarioPage;
	static LinksPage linksPage;
	static ImputsPage imputsPage;
	static BotoesPage botoesPage;
	static CheckBoxPage checkBoxPage;
	static DropdownPage dropdownPage;
//	static TextosPage textosPage;
//	static MudarFocoPage mudarFocoPage;
//	static AccordionPage accordionPage;
//	static AutoCompletePage autoCompletePage;
//	static DatapickerPage datapickerPage;
//	static DragAndDropPage dragAndDropPage;
//	static MousehoverPage mousehverPage;
//	static UploadArquivoPage uploadArquivoPage;
//	static ScrollPage scrollPage;
	
	
		@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			// Mostrar onde se encontra o executavél do Chrome
			System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			// Abrindo o Browser
			driver.get("https://automacaocombatista.herokuapp.com/");
			driver.manage() .window() .maximize();
			homePage = new HomePage (driver);
			cadastroUsuarioPage = new CadastroUsuarioPage (driver);
			listaUsuarioPage = new ListaUsuarioPage (driver);
			linksPage = new LinksPage (driver);
			imputsPage = new ImputsPage (driver);
			botoesPage = new BotoesPage (driver);
			checkBoxPage = new CheckBoxPage (driver);
			dropdownPage = new DropdownPage (driver);
			//Sleep sleep = new Sleep (driver);
		
	}

		
	@Test
	public void test() throws InterruptedException {
			homePage.Home();
			cadastroUsuarioPage.CadastroUsuario();
			listaUsuarioPage.ListaUsuario();
			linksPage.Links();
			imputsPage.Imputs();
			botoesPage.Botoes();
			checkBoxPage.CheckBox();
			dropdownPage.Dropdown();
		}
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Fechando o Browser
		   driver.close();
		
	}



}
