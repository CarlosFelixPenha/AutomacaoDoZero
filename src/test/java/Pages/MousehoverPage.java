package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseHoverPage {

	static WebDriver driver;
	
public MouseHoverPage (WebDriver driver) {
		MouseHoverPage.driver = driver;
		
	}
	
public void clicarLinkMouseHover () throws InterruptedException {
	
	
	WebElement IteracoesMouseHover = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a"));
	IteracoesMouseHover.click();
	Thread.sleep(500);
	
	WebElement LinkMouseHover = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[5]/div/ul/li[2]/a"));
	LinkMouseHover.click();
	Thread.sleep(500);
	
//	WebElement MouseHover = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/span/p"));
//	MouseHover.click();
//	Thread.sleep(500);
	
	WebElement BotaoVoltarMouseHover = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
	BotaoVoltarMouseHover.sendKeys("Carlos");
	Thread.sleep(2000);
	
	}
}
