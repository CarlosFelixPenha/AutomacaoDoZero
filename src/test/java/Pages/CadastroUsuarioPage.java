package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroUsuarioPage {

	static WebDriver driver;
	
	public CadastroUsuarioPage (WebDriver driver) {
		CadastroUsuarioPage.driver = driver;
		
	}
	
public void clicarLinkCriarUsuarios () throws InterruptedException {
	
	
	WebElement FormularioCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
	FormularioCriarUsuario.click();
	Thread.sleep(500);
	
	WebElement LinkCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
	LinkCriarUsuario.click();
	Thread.sleep(500);
	
	WebElement CampoNome = driver.findElement(By.name("user[name]"));
	CampoNome.sendKeys("Carlos");
	Thread.sleep(300);
	
	WebElement CampoSobreNome = driver.findElement(By.id("user_lastname"));
	CampoSobreNome.sendKeys("Guillen");
	Thread.sleep(300);
	
	WebElement CampoEmail = driver.findElement(By.id("user_email"));
	CampoEmail.sendKeys("carlosguillen@teste.com.br");
	Thread.sleep(300);
	
	WebElement CampoEndereco = driver.findElement(By.id("user_address"));
	CampoEndereco.sendKeys("Rua dos ladrilhos 109");
	Thread.sleep(300);
	
	WebElement CampoUniversidade = driver.findElement(By.name("user[university]"));
	CampoUniversidade.sendKeys("Universidade do Mato Grosso do Sul");
	Thread.sleep(300);
	
	WebElement CampoProfissao = driver.findElement(By.id("user_profile"));
	CampoProfissao.sendKeys("QA - Quality Assurance");
	Thread.sleep(300);
	
	WebElement CampoGenero = driver.findElement(By.id("user_gender"));
	CampoGenero.sendKeys("Masculino");
	Thread.sleep(300);
	
	WebElement CampoIdade = driver.findElement(By.name("user[age]"));
	CampoIdade.sendKeys("49");
	Thread.sleep(300);
	
	WebElement BotaoCriar = driver.findElement (By.name("commit"));
	BotaoCriar.click();
	Thread.sleep(500);
	
	WebElement BotaoVoltarCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[2]"));
	BotaoVoltarCriarUsuario.click();
	Thread.sleep(2000);
	
	WebElement BotaoVoltarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
	BotaoVoltarUsuario.click();
	Thread.sleep(2000);

}
}
