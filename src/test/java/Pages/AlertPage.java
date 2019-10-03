package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {

	static WebDriver driver;
	
	public AlertPage (WebDriver driver) {
		AlertPage.driver = driver;
		
	}
	
	public void clicarLinkAlert () throws InterruptedException {
		
		WebElement MudancaFocoAlert = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a"));
		MudancaFocoAlert.click();
		Thread.sleep(500);
		
		WebElement LinkAlert = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[1]/a"));
		LinkAlert.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarAlert = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div/a"));
		BotaoVoltarAlert.click();
		Thread.sleep(2000);
	
}
}