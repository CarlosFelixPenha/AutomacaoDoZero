package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BotoesPage {

	
	static WebDriver driver;
	
public BotoesPage (WebDriver driver) {
		BotoesPage.driver = driver;
	}

public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
	}

public void clicarBuscaDeElementosBotoes () throws InterruptedException {
		WebElement BuscaDeElementosBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaDeElementosBotoes.click();
		Thread.sleep(300);
		}
		
public void clicarLinkBotoes () throws InterruptedException {
		WebElement LinkBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[3]/a"));
		LinkBotoes.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoRaised () throws InterruptedException {
		WebElement BotaoRaised = driver.findElement (By.id("teste"));
		BotaoRaised.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoFlat () throws InterruptedException {
		WebElement BotaoFlat = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div[1]/div/a"));
		BotaoFlat.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltarBotoes () throws InterruptedException {
		WebElement BotaoVoltarBotoes = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[8]/div/a"));
		BotaoVoltarBotoes.click();
		Thread.sleep(500);
		
}
}
