package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {

	static WebDriver driver;
	
public DropdownPage (WebDriver driver) {
		DropdownPage.driver = driver;
		}
	
public void HomePage (WebDriver driver) {
		   HomePage.driver = driver;
		}
	
public void clicarBuscaDeElementosDropdownSelect () throws InterruptedException {
		WebElement BuscaDeElementosDropdownSelect = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		BuscaDeElementosDropdownSelect.click();
		Thread.sleep(300);
		}
		
public void clicarLinkDropdownSelect () throws InterruptedException {
		WebElement LinkDropdownSelect = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a"));
		LinkDropdownSelect.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoMailBoxUnread () throws InterruptedException {
		WebElement BotaoMailBoxUnread = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		BotaoMailBoxUnread.click();
		Thread.sleep(300);
		}
		
public void clicarOpcaoUnread () throws InterruptedException {
		WebElement OpcaoUnread = driver.findElement (By.id("dropdown1"));
		OpcaoUnread.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoMailBoxOutbox () throws InterruptedException {
		WebElement BotaoMailBoxOutbox = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		BotaoMailBoxOutbox.click();
		Thread.sleep(300);
		}
		
public void clicarOpcaoOutBox () throws InterruptedException {
		WebElement OpcaoOutBox = driver.findElement (By.id("dropdown4"));
		OpcaoOutBox.click();
		Thread.sleep(300);
		}
		
public void clicarSelectPais () throws InterruptedException {		
		WebElement SelectPais = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input"));
		SelectPais.click();
		Thread.sleep(300);
		}
		
public void clicarOpcaoInterneExplorer () throws InterruptedException {
		WebElement OpcaoInternetExplorer = driver.findElement (By.xpath("//*[@id=\"dropdown\"]/option[5]"));
		OpcaoInternetExplorer.click();
		Thread.sleep(300);
		}
		
public void clicarBotaoVoltarDropdown () throws InterruptedException {
		WebElement BotaoVoltarDropdown = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[7]/div/a"));
		BotaoVoltarDropdown.click();
		Thread.sleep(500);
		}

}
