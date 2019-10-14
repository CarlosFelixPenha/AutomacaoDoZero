package Pages;



//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroUsuarioPage {

	static WebDriver driver;
	
public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
}	
public CadastroUsuarioPage (WebDriver driver) {
	   CadastroUsuarioPage.driver = driver;
	}
	
public void clicarFormularioCriarUsuarios () throws InterruptedException {
		
	WebElement FormularioCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
	FormularioCriarUsuario.click();
	Thread.sleep(500);
	}
	
public void clicarLinkCriarUsuarios () throws InterruptedException {
	
	WebElement LinkCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
	LinkCriarUsuario.click();
	Thread.sleep(1000);
	}
	
public void editarCampoNome () throws InterruptedException {
	
	WebElement CampoNome = driver.findElement(By.id("user_name"));
	CampoNome.sendKeys("Carlos");
	Thread.sleep(1000);
	}
	
public void editarCampoSobrenome () throws InterruptedException {
	WebElement CampoSobrenome = driver.findElement(By.id("user_lastname"));
	CampoSobrenome.sendKeys("Guillen");
	Thread.sleep(300);
	}
	
public void editarCampoEmail () throws InterruptedException {
	WebElement CampoEmail = driver.findElement(By.id("user_email"));
	CampoEmail.sendKeys("carlosguillen@teste.com.br");
	Thread.sleep(300);
	}
	
public void editarCampoEndereco () throws InterruptedException {
	WebElement CampoEndereco = driver.findElement(By.id("user_address"));
	CampoEndereco.sendKeys("Rua dos ladrilhos 109");
	Thread.sleep(300);
	}

public void editarCampoUniversidade () throws InterruptedException {
	WebElement CampoUniversidade = driver.findElement(By.name("user[university]"));
	CampoUniversidade.sendKeys("Universidade do Mato Grosso do Sul");
	Thread.sleep(300);
	}
	
public void editarCampoProfissao () throws InterruptedException {
	WebElement CampoProfissao = driver.findElement(By.id("user_profile"));
	CampoProfissao.sendKeys("QA - Quality Assurance");
	Thread.sleep(300);
	}
	
public void editarCampoGenero () throws InterruptedException {
	WebElement CampoGenero = driver.findElement(By.id("user_gender"));
	CampoGenero.sendKeys("Masculino");
	Thread.sleep(300);
	}
	
public void editarCampoIdade () throws InterruptedException {
	WebElement CampoIdade = driver.findElement(By.name("user[age]"));
	CampoIdade.sendKeys("49");
	Thread.sleep(300);
	}
	
public void clicarBotaoCriar () throws InterruptedException {
	WebElement BotaoCriar = driver.findElement (By.name("commit"));
	BotaoCriar.click();
	Thread.sleep(2000);
	}

//public String mensagemSucesso () {
//	return driver.findElement(By.id("notice")).getText();
//	}
	
public void clicarBotaoVoltarCriarUsuario () throws InterruptedException {
	WebElement BotaoVoltarCriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[2]"));
	BotaoVoltarCriarUsuario.click();
	Thread.sleep(2000);
	}
	
public void clicarBotaoVoltarUsuario () throws InterruptedException {
	WebElement BotaoVoltarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
	BotaoVoltarUsuario.click();
	Thread.sleep(2000);

	}
}











