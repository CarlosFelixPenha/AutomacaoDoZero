package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {

	static WebDriver driver;
	
	public LinksPage (WebDriver driver) {
		LinksPage.driver = driver;
		
	}
	
	public void Links () throws InterruptedException {
		
		WebElement Elementos = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		Elementos.click();
		Thread.sleep(500);
		
		WebElement Link = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a"));
		Link.click();
		Thread.sleep(500);
		
		WebElement Sucesso = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/a"));
		Sucesso.click();
		Thread.sleep(500);
		
		
		
		WebElement BotaoVoltar4 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltar4.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltar5 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div/a"));
		BotaoVoltar5.click();
		Thread.sleep(2000);
		
}
}
