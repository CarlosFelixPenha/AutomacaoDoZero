package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage {

	static WebDriver driver;
	
	public IframePage (WebDriver driver) {
		IframePage.driver = driver;
		
	}
	
	public void clicarLinkIframe () throws InterruptedException {
		
		WebElement MudancaDeFocoIframe = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a"));
		MudancaDeFocoIframe.click();
		Thread.sleep(500);
		
		WebElement LinkIframe = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[2]/a"));
		LinkIframe.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarIframe = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarIframe.click();
		Thread.sleep(2000);
	
}
	
}
