package week6;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class week61{
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		WebElement ajiolink = driver.findElement(By.xpath("//*[@id=\"loginAjio\"]"));
		ajiolink.click();
		Thread.sleep(2000);
		WebElement facebookBtn = driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[1]/div[1]/div[1]/div/span[2]"));
		facebookBtn.click();
		Thread.sleep(2000);
		Set <String> parentwindow = driver.getWindowHandles();
		Iterator iterator = parentwindow.iterator();
		while(iterator.hasNext()) {
			String childwindow = (String) iterator.next();
			if(!parentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
		WebElement emailormobileno = driver.findElement(By.xpath("//*[@id=\"email\"]")); 
		emailormobileno.sendKeys("bhumi27@gmail.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Pwd.sendKeys("@123");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		loginBtn.click();
		
		
	}
}