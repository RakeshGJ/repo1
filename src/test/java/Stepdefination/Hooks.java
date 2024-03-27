package Stepdefination;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;


public class Hooks extends Applicationutils {
	public static ExtentReports reports = null;
	public static ExtentTest test = null;
	



	@Before
	public void conigureReports()
	{
		String date = new Date().toString().replace(":", "_").replace(" " , "_");
	    reports=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport_" + date + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);

		System.out.println("Creating Repoerts");
	}
	@Before
	public void setupStep(Scenario sc)
	{
		System.out.println("************************************");
		System.out.println(sc.getName());
		System.out.println(sc.getSourceTagNames());
		System.out.println(sc.getId());
	}
	@After
	public void savingReports()
	{
		reports.flush();
	}
	
	@AfterStep
	public void cleanupScenario(Scenario sc) throws IOException
	{
		System.out.println("..........................................");
		//String testName = sc.getName().replace(" " , "_");
		System.out.println("Scenario Status : " + sc.getStatus());
		if(sc.isFailed())
		{
			System.out.println("********capturing Screen shots **************");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);

		
				FileUtils.copyFile(srcFile, new File("screenshots\\" +  "_" + getdateandtime() + ".png"));
			
		}
		


	}

	@Before("@dev")
	public void setupScenrioDev()
	{
		System.out.println("*******$$$$$$$$$$$$$$$$$$$$$$$$$$$$*********");
	}

	@After("@dev")
	public void cleanupScenarioDev()
	{
		System.out.println("##########&&&&&&&&&&&&&&&&&&&&&&&&&&&&#######");
	}


	@BeforeStep
	public void stepScenario()
	{
		System.out.println("-------------------------------------------");
	}

	@After
	public void afterScenrio()
	{
		System.out.println("###############################################3");
	}
}