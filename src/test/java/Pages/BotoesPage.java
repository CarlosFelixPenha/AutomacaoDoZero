package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BotoesPage {

	
	static WebDriver driver;
	
	public BotoesPage (WebDriver driver) {
		BotoesPage.driver = driver;
		
	}
	
	public void clicarLinkBotoes () throws InterruptedException {
		
		WebElement BuscaElementosBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaElementosBotoes.click();
		Thread.sleep(500);
		
		WebElement LinkBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[3]/a"));
		LinkBotoes.click();
		Thread.sleep(500);
		
		WebElement BotaoRaised = driver.findElement (By.id("teste"));
		BotaoRaised.click();
		Thread.sleep(500);
		
		WebElement BotaoFlat = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div[1]/div/a"));
		BotaoFlat.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[8]/div/a"));
		BotaoVoltarBotoes.click();
		Thread.sleep(2000);
		
}
}
