//package Tests;
//
////import static org.junit.Assert.assertEquals;
//
//import org.junit.AfterClass;
////import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.AccordionPage;
//import Pages.AlertPage;
//import Pages.BotoesPage;
////import Pages.CadastroUsuarioPage;
//import Pages.CheckBoxPage;
//import Pages.DropdownPage;
////import Pages.HomePage;
//import Pages.IframePage;
//import Pages.ImputsPage;
//import Pages.LinksPage;
//import Pages.ListaUsuarioPage;
//import Pages.ModalPage;
//import Pages.MouseHoverPage;
////import Pages.AutoCompletePage;
////import Pages.BotoesPage;
////import Pages.CadastroUsuarioPage;
////import Pages.CheckBoxPage;
////import Pages.DatapickerPage;
////import Pages.DragAndDropPage;
////import Pages.LinksPage;
////import Pages.ListaUsuarioPage;
////import Pages.MousehoverPage;
////import Pages.MudarFocoPage;
////import Pages.ScrollPage;
//import Pages.TextosPage;
//
//// Instanciando as classes (WebDriver, Home, Cadastro, Lista, Links, etc...)
//public class AutomacaoWeb {
//
////	static WebDriver driver;
////	static HomePage homePage;
////	static CadastroUsuarioPage cadastroUsuarioPage;
//	static ListaUsuarioPage listaUsuarioPage;
//	static LinksPage linksPage;
//	static ImputsPage imputsPage;
//	static BotoesPage botoesPage;
//	static CheckBoxPage checkBoxPage;
//	static DropdownPage dropdownPage;
//	static TextosPage textosPage;
//	static AccordionPage accordionPage;
//	static AlertPage alertPage;
//	static IframePage iframePage;
//	static ModalPage modalPage;
////	static MudarFocoPage mudarFocoPage;
////	static AutoCompletePage autoCompletePage;
////	static DatapickerPage datapickerPage;
////	static DragAndDropPage dragAndDropPage;
//	static MouseHoverPage mouseHoverPage;
////	static UploadArquivoPage uploadArquivoPage;
////	static ScrollPage scrollPage;
//	
//	
//		@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//			// Mostrar onde se encontra o executavél do Chrome
//			System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
//			driver = new ChromeDriver();
//			// Abrindo o Browser
//			driver.get("https://automacaocombatista.herokuapp.com/");
//			driver.manage() .window() .maximize();
//			
////			homePage = new HomePage (driver);
////			cadastroUsuarioPage = new CadastroUsuarioPage (driver);
//			listaUsuarioPage = new ListaUsuarioPage (driver);
//			linksPage = new LinksPage (driver);
//			imputsPage = new ImputsPage (driver);
//			botoesPage = new BotoesPage (driver);
//			checkBoxPage = new CheckBoxPage (driver);
//			dropdownPage = new DropdownPage (driver);
//			textosPage = new TextosPage (driver);
//			accordionPage = new AccordionPage (driver);
//			alertPage = new AlertPage (driver);
//			iframePage = new IframePage (driver);
//			modalPage = new ModalPage (driver);
//			mouseHoverPage = new MouseHoverPage (driver);
//		
//	}
//
//	@Test
//	public void test() throws InterruptedException {
//		    // Chamando os steps
////			homePage.clicarBotaoComecarAutomacaoWeb();
////			cadastroUsuarioPage.clicarLinkCriarUsuarios();
//			listaUsuarioPage.clicarLinkListaUsuarios();
//			linksPage.clicarLinkLinks();
//			imputsPage.clicarLinkImputsTextField();
//			botoesPage.clicarLinkBotoes();
//			checkBoxPage.clicarLinkRadioCheckbox();
//			dropdownPage.clicarLinkDropdownSelect();
//			textosPage.clicarLinkTextos();
//			accordionPage.clicarLinkAccordion();
//			alertPage.clicarLinkAlert();
//			iframePage.clicarLinkIframe();
//			modalPage.clicarLinkModal();
//			mouseHoverPage.clicarLinkMouseHover();
//		}
////	@Test
////	public void test1() throws InterruptedException {
////		cadastroUsuarioPage.clicarLinkCriarUsuarios();
////		
////		assertEquals(cadastroUsuarioPage.testeMensagemSucesso(), "Usuário Criado com sucesso");
////
////	}
//	
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		// Fechando o Browser
//		   driver.close();
//		
//	}
//
//}

