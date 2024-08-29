package framehandlingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		//by index method
		//driver.switchTo().frame(0);
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
		
		//by frame
		//driver.switchTo().frame("login_page");
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
		
		//by webElement
		WebElement frame1= driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
		
		
		

	}

}
