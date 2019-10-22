package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

	static WebDriver driver;
	
public DragAndDropPage (WebDriver driver) {
		DragAndDropPage.driver = driver;
	}

public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
	}

public void clicarIteracoesDragAndDrops () throws InterruptedException {
		WebElement iteracoesDragAndDrops = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[5]/a"));
		iteracoesDragAndDrops.click();
		Thread.sleep(300);
		}
		
public void clicarLinkDragAndDrops () throws InterruptedException {
		WebElement linkDragAndDrops = driver.findElement (By.xpath("/html/body/div[2]/div[1]/ul/li[5]/div/ul/li[1]/a"));
		linkDragAndDrops.click();
		Thread.sleep(300);
		}		
		
public void arrastarImagemDragAndDrops () throws InterruptedException {
		WebElement source = driver.findElement (By.id("winston"));
		WebElement target = driver.findElement(By.id("dropzone"));
		Actions arrastar = new Actions(driver);
		arrastar.dragAndDrop(source, target).perform();
		Thread.sleep(1000);
		}

public void clicarBotaoVoltarDrag () throws InterruptedException {
	WebElement botaoVoltarDrag = driver.findElement (By.xpath("/html/body/div[2]/div[2]/div[5]/div/div/a"));
	botaoVoltarDrag.click();
	Thread.sleep(500);
    }

}
