package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaUsuarioPage {

	static WebDriver driver;
	
public ListaUsuarioPage (WebDriver driver) {
		ListaUsuarioPage.driver = driver;
		}

public void HomePage (WebDriver driver) {
		   HomePage.driver = driver;
		}
	
public void clicarFormularioListaDeUsuarios () throws InterruptedException {
		WebElement FormularioListaDeUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
		FormularioListaDeUsuario.click();
		Thread.sleep(500);
		}

public void clicarLinkListaDeUsuarios () throws InterruptedException {	
		WebElement LinkListaDeUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"));
		LinkListaDeUsuario.click();
		Thread.sleep(500);
		}
		
public void clicarBotaoVoltarListaDeUsuario () throws InterruptedException {
		WebElement BotaoVoltarListaDeUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
		BotaoVoltarListaDeUsuario.click();
		Thread.sleep(2000);
		}
}
