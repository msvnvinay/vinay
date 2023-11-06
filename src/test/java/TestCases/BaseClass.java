package TestCases;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mongodb.MapReduceCommand.OutputType;


import Utilities.Readingdata;
import freemarker.log.Logger;

public class BaseClass {
	
	Readingdata rd=new Readingdata();
	public String baseURL=rd.getapplicationURL();
	public String username=rd.getUsername();
	public String password=rd.getPassword();
	
	public static Logger logger;
	//open application
	//close application
	//takes screenshot
	//log file generation
	public static WebDriver driver;
	
	@BeforeClass
	public void openApplication() {
		
		
		
		
		logger = Logger.getLogger("Hybridframework");
		PropertyConfigurator.configure("./test-output/Log4j.properties/");
		//launch browser
//		System.setProperty("webdriver.chrome.driver", rd.getchromepath());
		driver=new ChromeDriver();
		
		
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}
	
//	public void captureScreen(WebDriver driver,String name) throws IOException {
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;//initialization
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File target=new File("./Screenshots/"+name+ ".png");
//		
//		
//		FileUtils.copyFile(src, target);
//		log.info("screenshot is taken");
//		
//	}
	

}

