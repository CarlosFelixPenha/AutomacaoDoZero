package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	
	static WebDriver driver;
	
	public CheckBoxPage (WebDriver driver) {
		CheckBoxPage.driver = driver;
		
	}
	
	public void clicarLinkRadioCheckbox () throws InterruptedException {
		
		WebElement BuscaElementosRadioCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaElementosRadioCheckbox.click();
		Thread.sleep(500);
		
		WebElement LinkRadioCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a"));
		LinkRadioCheckbox.click();
		Thread.sleep(300);
		
		WebElement RadioboxBlue = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[2]/label"));
		RadioboxBlue.click();
		Thread.sleep(300);

		WebElement RadioboxYellow = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[3]/label"));
		RadioboxYellow.click();
		Thread.sleep(300);
		
		WebElement CheckboxWhite = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[4]/label"));
		CheckboxWhite.click();
		Thread.sleep(300);
		
		WebElement BotaoVoltarRadioCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarRadioCheckbox.click();
		Thread.sleep(2000);
		
}
}
