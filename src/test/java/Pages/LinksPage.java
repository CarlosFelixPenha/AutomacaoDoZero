package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {

	static WebDriver driver;
	
	public LinksPage (WebDriver driver) {
		LinksPage.driver = driver;
		
	}
	
	public void clicarLinkLinks () throws InterruptedException {
		
		WebElement BuscaElementosLinks = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaElementosLinks.click();
		Thread.sleep(500);
		
		WebElement LinkLinks = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a"));
		LinkLinks.click();
		Thread.sleep(500);
		
		WebElement LinkSucesso = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/a"));
		LinkSucesso.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarSucesso = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarSucesso.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarLinks = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div/a"));
		BotaoVoltarLinks.click();
		Thread.sleep(2000);
		
}
}
