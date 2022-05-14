package com.Wallethu1.testCases;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Wallethu1.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		String title=driver.getTitle();
		System.out.println(title);
		logger.info("get title sucess"+title);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scrollBy(0,250)");
		Thread.sleep(2000);
		lp.clickover_click_what_is_your_mind_ravi();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("hello--world");
		Thread.sleep(5000);
		lp.click_over_post_btn();
		Thread.sleep(5000);
		lp.clickraviprofile();
		Thread.sleep(8000);
		String title1=driver.getTitle();
		System.out.println(title1);
		logger.info("get title sucess"+ ' ' + title1);
		((JavascriptExecutor)driver).executeScript("scrollBy(0,450)");
		Thread.sleep(10000);
		captureScreen(driver,"loginTest1");
		logger.info("took screenshot");
		
		if(driver.getTitle().equals(title1))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
