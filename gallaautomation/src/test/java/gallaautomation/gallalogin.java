package gallaautomation;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class gallalogin {
	public static WebDriver driver;

	public void check_SS() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.galla.app/mystore/index.php");
		WebElement logo = driver.findElement(By.cssSelector("div.login-box-body"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"/home/sandeepkumar/Desktop/New Folder 6/gallaautomation/test-output/screenshorts/loginpage.png");

		FileHandler.copy(source, destination);
//		FileUtils.copyFile(source, destination);
	}

}
