package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaUsuarioPage {

	static WebDriver driver;
	
	public ListaUsuarioPage (WebDriver driver) {
		ListaUsuarioPage.driver = driver;
		
	}
	
	public void clicarLinkListaUsuarios () throws InterruptedException {
		
		WebElement FormularioListaUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
		FormularioListaUsuario.click();
		Thread.sleep(500);
		
		WebElement LinkListaUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"));
		LinkListaUsuario.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarListaUsuario = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
		BotaoVoltarListaUsuario.click();
		Thread.sleep(2000);

}
}
