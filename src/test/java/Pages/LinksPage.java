package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {

	static WebDriver driver;
	
public void HomePage (WebDriver driver) {
		   HomePage.driver = driver;
	}	

public LinksPage (WebDriver driver) {
		LinksPage.driver = driver;
		
	}
	
public void clicarBuscaDeElementosLinks () throws InterruptedException {
		WebElement BuscaDeElementosLinks = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaDeElementosLinks.click();
		Thread.sleep(500);
		}
		
public void clicarLinks () throws InterruptedException {
		WebElement Links = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a"));
		Links.click();
		Thread.sleep(300);
		}

public void clicarLinkSucesso () throws InterruptedException {
		WebElement LinkSucesso = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/a"));
		LinkSucesso.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltarSucesso () throws InterruptedException {
		WebElement BotaoVoltarSucesso = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarSucesso.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltarLinks () throws InterruptedException {
		WebElement BotaoVoltarLinks = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div/a"));
		BotaoVoltarLinks.click();
		Thread.sleep(500);
		}
}
