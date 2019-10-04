package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalPage {

	
	static WebDriver driver;
	
	public ModalPage (WebDriver driver) {
		ModalPage.driver = driver;
		
	}
	
	public void clicarLinkModal () throws InterruptedException {
		
		WebElement MudancaFocoModal = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a"));
		MudancaFocoModal.click();
		Thread.sleep(500);
		
		WebElement LinkModal = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[3]/div/ul/li[4]/a"));
		LinkModal.click();
		Thread.sleep(500);
		
		WebElement BotaoAbrir = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/a"));
		BotaoAbrir.click();
		Thread.sleep(500);
		
		WebElement BotaoFechar = driver.findElement (By.xpath("//*[@id=\"modal1\"]/div[2]/a"));
		BotaoFechar.click();
		Thread.sleep(500);
		
		WebElement BotaoVoltarModal = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarModal.click();
		Thread.sleep(2000);
	
}
}
