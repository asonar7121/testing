package mymavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myActivity_1 
{
	
@Test
	
	public void data() throws IOException
	{
	WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		File f=new File("C:\\Users\\abhay\\Desktop\\l.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
        driver.quit();
	}

}
