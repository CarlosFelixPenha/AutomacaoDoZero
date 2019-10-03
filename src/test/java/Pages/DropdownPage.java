package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {

	static WebDriver driver;
	
	public DropdownPage (WebDriver driver) {
		DropdownPage.driver = driver;
		
	}
	
	public void Dropdown () throws InterruptedException {
		
		WebElement Elementos4 = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		Elementos4.click();
		Thread.sleep(500);
		
		WebElement Select = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a"));
		Select.click();
		Thread.sleep(500);
		
		WebElement MailBox = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		MailBox.click();
		Thread.sleep(500);

		WebElement Unread = driver.findElement (By.id("dropdown1"));
		Unread.click();
		Thread.sleep(300);
		
		WebElement MailBox1 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/a"));
		MailBox1.click();
		Thread.sleep(500);
		
		WebElement OutBox = driver.findElement (By.id("dropdown4"));
		OutBox.click();
		Thread.sleep(500);
		
//		WebElement Pais = driver.findElement (By.xpath("//*[@id=\"select-options-c2bc24ca-e117-c865-c1d3-57cbaf719325\"]/li[1]/span"));
//		Pais.click();
//		Thread.sleep(500);
//		
//		WebElement Inglaterra = driver.findElement (By.xpath("//*[@id=\"select-options-3754f0c7-454d-ee82-c8d7-5316b5780904\"]/li[5]/span"));
//		Inglaterra.click();
//		Thread.sleep(500);
		
		WebElement BotaoVoltar9 = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div/div[7]/div/a"));
		BotaoVoltar9.click();
		Thread.sleep(1000);
		
}
}
