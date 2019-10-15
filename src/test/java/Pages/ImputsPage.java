package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImputsPage {

	
	static WebDriver driver;
	
public ImputsPage (WebDriver driver) {
		ImputsPage.driver = driver;
		}

public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
	}

	
public void clicarBuscaDeElementosImputs () throws InterruptedException {
		
		WebElement BuscaDeElementosImputs = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaDeElementosImputs.click();
		Thread.sleep(500);
		}
		
public void clicarImputsTextField () throws InterruptedException {
		WebElement ImputsTextField = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a"));
		ImputsTextField.click();
		Thread.sleep(500);
		}
		
public void clicarCampoFirstName () throws InterruptedException {
		WebElement CampoFirstName = driver.findElement (By.id("first_name"));
		CampoFirstName.sendKeys("Jorge");
		Thread.sleep(300);
		}
		
public void clicarCampoLastName () throws InterruptedException {
		WebElement CampoLastName = driver.findElement (By.id("last_name"));
		CampoLastName.sendKeys("Guillen");
		Thread.sleep(300);
		}
		
public void clicarCampoTextArea () throws InterruptedException {
		WebElement CampoTextArea = driver.findElement (By.id("textarea1"));
		CampoTextArea.sendKeys("GGGGGGGGGGGGGGGGGGGGGGGGGGGAAAAAAAAAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOO");
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltaImputs () throws InterruptedException {
		WebElement BotaoVoltarImputs = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[6]/div/a"));
		BotaoVoltarImputs.click();
		Thread.sleep(500);
		}

}
