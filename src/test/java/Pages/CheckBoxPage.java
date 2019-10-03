package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	
	static WebDriver driver;
	
	public CheckBoxPage (WebDriver driver) {
		CheckBoxPage.driver = driver;
		
	}
	
	public void CheckBox () throws InterruptedException {
		
		WebElement Elementos3 = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		Elementos3.click();
		Thread.sleep(500);
		
		WebElement Radio = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a"));
		Radio.click();
		Thread.sleep(300);
		
		WebElement Blue = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[2]/label"));
		Blue.click();
		Thread.sleep(300);

		WebElement Yellow = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[3]/label"));
		Yellow.click();
		Thread.sleep(300);
		
		WebElement White = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[4]/label"));
		White.click();
		Thread.sleep(300);
		
		WebElement BotaoVoltar8 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltar8.click();
		Thread.sleep(1000);
		
}
}
