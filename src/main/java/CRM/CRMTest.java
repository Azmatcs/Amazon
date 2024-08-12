package CRM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.io.Files;
public class CRMTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		

WebDriver driver=new ChromeDriver();


		driver.get("https://freecrm.com/");		
		String Title=	driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever",Title);
		
	   
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left'])[1]")).click();
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left'])[1]")).click();
		driver.findElement(By.name("email")).sendKeys("aliazmataly@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Azmat@100");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		String tit=driver.getTitle();
		System.out.println(tit);
		Assert.assertEquals(tit,"Cogmento CRM");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("E://Automation//crm.png");
		Files.copy(src, des);
	}

}
