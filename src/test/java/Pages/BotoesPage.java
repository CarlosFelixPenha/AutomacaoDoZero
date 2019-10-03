package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BotoesPage {

	
	static WebDriver driver;
	
	public BotoesPage (WebDriver driver) {
		BotoesPage.driver = driver;
		
	}
	
	public void Botoes () throws InterruptedException {
		
		WebElement Elementos2 = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		Elementos2.click();
		Thread.sleep(500);
		
		WebElement Botao = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[3]/a"));
		Botao.click();
		Thread.sleep(500);
		
		WebElement Raised = driver.findElement (By.id("teste"));
		Raised.click();
		Thread.sleep(500);
		
		WebElement Flat = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div[1]/div/a"));
		Flat.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltar7 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[8]/div/a"));
		BotaoVoltar7.click();
		Thread.sleep(1000);
		
}
}
