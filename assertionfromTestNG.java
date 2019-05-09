import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertionfromTestNG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pavithra/workspace/WebDriverTest/ChromeDriver/chromedriver");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.spicejet.com/");
		wd.manage().window().maximize();
		Assert.assertFalse(wd.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		wd.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		wd.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		 int i = 1; // Initialize 
			while (i < 5) // compare (This is the basic how to put while loop)
			{
				wd.findElement(By.id("hrefIncAdt")).click();
				i++; // condition to incrementing the i so that once the click is done the i value will get incremented.
			}
			//wd.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals("5 Adults", wd.findElements(By.id("hrefIncAdt")).size());
		wd.close();
	}

}
/* Note:
 * If the assert false condition does not statify then the further execution will get stopped.
 * Error will be thrown in console.
 */
