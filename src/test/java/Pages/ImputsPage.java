package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImputsPage {

	
	static WebDriver driver;
	
	public ImputsPage (WebDriver driver) {
		ImputsPage.driver = driver;
		
	}
	
	public void clicarLinkImputsTextField () throws InterruptedException {
		
		WebElement ElementosImputsTextField = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		ElementosImputsTextField.click();
		Thread.sleep(500);
		
		WebElement LinkImputsTextField = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a"));
		LinkImputsTextField.click();
		Thread.sleep(500);
		
		WebElement CampoFirstName = driver.findElement (By.id("first_name"));
		CampoFirstName.sendKeys("Jorge");
		Thread.sleep(300);
		
		WebElement CampoLastName = driver.findElement (By.id("last_name"));
		CampoLastName.sendKeys("Guillen");
		Thread.sleep(300);
		
		WebElement CampoTextName = driver.findElement (By.id("textarea1"));
		CampoTextName.sendKeys("GGGGGGGGGGGGGGGGGGGGGGGGGGGAAAAAAAAAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOO");
		Thread.sleep(300);
		
		WebElement BotaoVoltarImputsTextField = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[6]/div/a"));
		BotaoVoltarImputsTextField.click();
		Thread.sleep(2000);

		
}
}
