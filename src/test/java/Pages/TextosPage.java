package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextosPage {
	
	static WebDriver driver;
	
	public TextosPage (WebDriver driver) {
		TextosPage.driver = driver;
		
	}
	
	public void clicarLinkTextos () throws InterruptedException {
		
		WebElement BuscaElementosTextos = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaElementosTextos.click();
		Thread.sleep(500);
		
		WebElement LinkTextos = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[6]/a"));
		LinkTextos.click();
		Thread.sleep(500);

		WebElement BotaoVoltarTextos = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div/a"));
		BotaoVoltarTextos.click();
		Thread.sleep(2000);

}
}