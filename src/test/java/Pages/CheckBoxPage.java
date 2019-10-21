package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	
	static WebDriver driver;
	
public CheckBoxPage (WebDriver driver) {
		CheckBoxPage.driver = driver;
	}

public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
	}

public void clicarBuscaDeElementosCheckbox () throws InterruptedException {
		WebElement BuscaDeElementosCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaDeElementosCheckbox.click();
		Thread.sleep(300);
		}
		
public void clicarLinkRadioCheckbox () throws InterruptedException {
		WebElement LinkRadioCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a"));
		LinkRadioCheckbox.click();
		Thread.sleep(300);
		}		
		
public void clicarRadioBoxBlue () throws InterruptedException {
		WebElement RadioBoxBlue = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[2]/label"));
		RadioBoxBlue.click();
		Thread.sleep(300);
		}
		
public void clicarRadioBoxYellow () throws InterruptedException {
		WebElement RadioBoxYellow = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[3]/label"));
		RadioBoxYellow.click();
		Thread.sleep(300);
		}
		
public void clicarCheckBoxWhite () throws InterruptedException {
		WebElement CheckBoxWhite = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[4]/label"));
		CheckBoxWhite.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltarCheckBox () throws InterruptedException {
		WebElement BotaoVoltarRadioCheckbox = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[4]/div/a"));
		BotaoVoltarRadioCheckbox.click();
		Thread.sleep(500);
		}
}
