package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImputsPage {

	
	static WebDriver driver;
	
	public ImputsPage (WebDriver driver) {
		ImputsPage.driver = driver;
		
	}
	
	public void Imputs () throws InterruptedException {
		
		WebElement Elementos1 = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		Elementos1.click();
		Thread.sleep(500);
		
		WebElement TextField = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a"));
		TextField.click();
		Thread.sleep(500);
		
		WebElement FirstName = driver.findElement (By.id("first_name"));
		FirstName.sendKeys("Jorge");
		Thread.sleep(300);
		
		WebElement LastName = driver.findElement (By.id("last_name"));
		LastName.sendKeys("Guillen");
		Thread.sleep(300);
		
		WebElement TextName = driver.findElement (By.id("textarea1"));
		TextName.sendKeys("GGGGGGGGGGGGGGGGGGGGGGGGGGGAAAAAAAAAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOO");
		Thread.sleep(300);
		
		WebElement BotaoVoltar6 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[6]/div/a"));
		BotaoVoltar6.click();
		Thread.sleep(1000);

		
}
}
