package TestCases;


import java.time.Duration;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_LoginPage extends BaseClass {

	@Test
	public void logintest() throws InterruptedException {

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage lp=new LoginPage(driver);
        logger.info("Brower Opended");
		lp.setUsername();
        logger.info("User Name Entered");
		lp.setPassword();
		logger.info("Password Name Entered");
		lp.ClickLoginbtn();
		logger.info("the application is closed");



	}

}

