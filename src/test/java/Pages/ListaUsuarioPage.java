package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaUsuarioPage {

	static WebDriver driver;
	
	public ListaUsuarioPage (WebDriver driver) {
		ListaUsuarioPage.driver = driver;
		
	}
	
	public void ListaUsuario () throws InterruptedException {
		
		WebElement Formulario1 = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
		Formulario1.click();
		Thread.sleep(1000);
		
		WebElement Lista = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"));
		Lista.click();
		Thread.sleep(1000);
		
		WebElement BotaoVoltar2 = driver.findElement (By.xpath("/html/body/div[2]/div[3]/div/a[2]"));
		BotaoVoltar2.click();
		Thread.sleep(2000);

}
}
