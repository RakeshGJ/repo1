package Stepdefination;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {
	public static WebDriver driver;
	public WebDriverWait wait = null;
	
	

	public WebDriver getdriver(String type) {
		System.out.println("creating a driver object");
		switch (type.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
		default:
			driver = null;
			System.out.println("please chck the driver type");
			break;
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 30);

		return driver;
	}

	public WebElement getelement(String identifiers, String value) {
		System.out.println("find the elemenet using" + identifiers + "value" + value);
		WebElement ele;
		switch (identifiers.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			ele = null;
			System.out.println("please check the identifiers and value");
			break;
		}
		return ele;

	}
	public List<WebElement> getElements(String identifier, String value)
	{
		List<WebElement> ele = null;
		switch (identifier.toLowerCase()) {
		case "id":
			ele = driver.findElements(By.id(value));
			break;

		case "name":
			ele = driver.findElements(By.name(value));
			break;

		case "classname":
			ele = driver.findElements(By.className(value));
			break;

		case "tagname":
			ele = driver.findElements(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElements(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElements(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElements(By.cssSelector(value));
			break;

		case "xpath":
			ele = driver.findElements(By.xpath(value));
			break;

		default:
			System.out.println("Please check the identifier, OR contact framework developers");
			break;
		}
		return ele;
	}

	public void type(String identifiiers, String value, String texttoentr) {
		System.out.println("perform type operation " + texttoentr);
		getelement(identifiiers, value).sendKeys(texttoentr);
		System.out.println("type operation completed");
	}

	public void click(String identifiers, String value) {
		System.out.println("perform click operation");
		getelement(identifiers, value).click();
		System.out.println("click operation is complited");
	}

	public void pauseexecution(int ms)  {
		System.out.println("keep some staticwait");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wait until satatic wait is complited");

	}

	public String gettext(String identifiers, String value) {
		System.out.println("print the text present on specific webelement");
		return getelement(identifiers, value).getText();
	}

	public String getdateandtime() {
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}

	public void takescreenshot(String testname) {
		System.out.println("take the screenshot on testfailure");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("screenshots\\" + getdateandtime() + testname + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String gettitle() {
		System.out.println("print the title present on the element");
		return driver.getTitle();

	}
}
