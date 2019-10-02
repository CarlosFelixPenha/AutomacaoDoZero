package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroUsuarioPage {

	static WebDriver driver;
	
	public CadastroUsuarioPage (WebDriver driver) {
		CadastroUsuarioPage.driver = driver;
		
	}
	
public void CadastroUsuario () throws InterruptedException {
	
	
	WebElement Formulario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
	Formulario.click();
	Thread.sleep(1000);
	
	WebElement CriarUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
	CriarUsuario.click();
	Thread.sleep(500);
	
	WebElement Nome = driver.findElement(By.name("user[name]"));
	Nome.sendKeys("Carlos");
	Thread.sleep(300);
	
	WebElement SobreNome = driver.findElement(By.id("user_lastname"));
	SobreNome.sendKeys("Guillen");
	Thread.sleep(300);
	
	WebElement Email = driver.findElement(By.id("user_email"));
	Email.sendKeys("carlosguillen@teste.com.br");
	Thread.sleep(300);
	
	WebElement Endereco = driver.findElement(By.id("user_address"));
	Endereco.sendKeys("Rua dos ladrilhos 109");
	Thread.sleep(300);
	
	WebElement Universidade = driver.findElement(By.name("user[university]"));
	Universidade.sendKeys("Universidade do Mato Grosso do Sul");
	Thread.sleep(300);
	
	WebElement Profissao = driver.findElement(By.id("user_profile"));
	Profissao.sendKeys("QA - Quality Assurance");
	Thread.sleep(300);
	
	WebElement Genero = driver.findElement(By.id("user_gender"));
	Genero.sendKeys("Masculino");
	Thread.sleep(300);
	
	WebElement Idade = driver.findElement(By.name("user[age]"));
	Idade.sendKeys("49");
	Thread.sleep(300);
	
	WebElement BotaoCriar = driver.findElement (By.name("commit"));
	BotaoCriar.click();
	Thread.sleep(1000);
	
	WebElement BotaoVoltar1 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[2]"));
	BotaoVoltar1.click();
	Thread.sleep(1000);
	
	WebElement BotaoVoltar3 = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
	BotaoVoltar3.click();
	Thread.sleep(1000);

}
}
