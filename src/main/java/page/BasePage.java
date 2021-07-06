package page;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void selectDropDown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
}
	public int generaterandomNumber(int bound) {
		Random rnd = new Random();
		int generaterandomNumber = rnd.nextInt(bound);
		return generaterandomNumber;
		
	}
	 public  void clickCustomerElement(WebDriver driver,WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",element);
	   }
	 public  void waitforElement (WebDriver driver ,int seconds, WebElement element) {
			
			WebDriverWait wait = new WebDriverWait(driver,seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
	 }
}