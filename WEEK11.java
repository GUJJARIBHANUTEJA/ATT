import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://www.google.com");
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("myntra");
		Thread.sleep(6000);
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		WebElement myntraLink=driver.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span"));
		myntraLink.click();
		WebElement profileHyperLink = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]"));
		profileHyperLink.click();
		Thread.sleep(2000);
		WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a"));
		loginBtn.click();
		WebElement Mobileno = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
		Mobileno.sendKeys("9966636290");
		WebElement continueBtn= driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]"));
		continueBtn.click();
		Thread.sleep(5000);
		

	}

}
