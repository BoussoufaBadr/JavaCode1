package Bank1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yahyaboussoufa/eclipse-workspace/ProjectBank/chromedriver 3");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("http://demo.guru99.com/V1/index.php");
		
		driver.manage().window().maximize() ;
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr225288");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udezYza");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
	}

}
