package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	static WebDriver driver;

	public HomePage (WebDriver driver) {
		HomePage.driver = driver;
		
	}

	public void clicarBotaoComecarAutomacaoWeb () throws InterruptedException {
				
		WebElement BotaoComecarAutomacaoWeb = driver.findElement (By.xpath("//*[@id=\"index-banner\"]/div/div[3]/a"));
		BotaoComecarAutomacaoWeb.click();
		Thread.sleep(2000);
	
	}
}
