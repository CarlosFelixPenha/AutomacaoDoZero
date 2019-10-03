package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {

	static WebDriver driver;
	
	public DropdownPage (WebDriver driver) {
		DropdownPage.driver = driver;
		
	}
	
	public void clicarLinkDropdownSelect () throws InterruptedException {
		
		WebElement BuscaElementosDropdownSelect = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaElementosDropdownSelect.click();
		Thread.sleep(500);
		
		WebElement LinkDropdownSelect = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a"));
		LinkDropdownSelect.click();
		Thread.sleep(500);
		
		WebElement BotaoMailBoxUnread = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		BotaoMailBoxUnread.click();
		Thread.sleep(500);

		WebElement OpcaoUnread = driver.findElement (By.id("dropdown1"));
		OpcaoUnread.click();
		Thread.sleep(500);
		
		WebElement BotaoMailBoxOutbox = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		BotaoMailBoxOutbox.click();
		Thread.sleep(500);
		
		WebElement OpcaoOutBox = driver.findElement (By.id("dropdown4"));
		OpcaoOutBox.click();
		Thread.sleep(500);
		
		WebElement SelectPais = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input"));
		SelectPais.click();
		Thread.sleep(500);
		
//		WebElement CZodiaco = driver.findElement (By.xpath("//*[@id=\"select-options-970cf911-794b-1151-f0ca-6e60044fe979\"]/li[4]"));
//		CZodiaco.click();
//		Thread.sleep(1000);
		
//		WebElement Browser = driver.findElement (By.xpath("//*[@id=\"dropdown\"]/option[1]"));
//		Browser.click();
//		Thread.sleep(1000);
		
		WebElement OpcaoInternetExplorer = driver.findElement (By.xpath("//*[@id=\"dropdown\"]/option[5]"));
		OpcaoInternetExplorer.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarDropdownSelect = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[7]/div/a"));
		BotaoVoltarDropdownSelect.click();
		Thread.sleep(2000);
		
}
}
