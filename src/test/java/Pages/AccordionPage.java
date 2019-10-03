package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccordionPage {
	
	
	static WebDriver driver;
	
	public AccordionPage (WebDriver driver) {
		AccordionPage.driver = driver;
		
	}
	
	public void clicarLinkAccordion () throws InterruptedException {
		
		WebElement WidgetsAccordion = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a"));
		WidgetsAccordion.click();
		Thread.sleep(500);
		
		WebElement LinkAccordion = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[4]/div/ul/li[1]/a"));
		LinkAccordion.click();
		Thread.sleep(500);

		WebElement CampoFirst = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/ul/li[1]/div[1]"));
		CampoFirst.click();
		Thread.sleep(500);
		
		WebElement CampoThird = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/ul/li[3]/div[1]"));
		CampoThird.click();
		Thread.sleep(500);

		WebElement BotaoVoltarAccordion = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/a"));
		BotaoVoltarAccordion.click();
		Thread.sleep(2000);
}

}
