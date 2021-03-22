package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.DashboardPage;
import util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;
	
	@Test
	public void UserShouldAddCategory () throws InterruptedException {
		driver = BrowserFactory.init();
	     AddCategoryPage  addCategorypage = PageFactory.initElements(driver, AddCategoryPage.class);
		 addCategorypage.insertCategory("Techfios");
		 addCategorypage.clickOnSubmit();
		 Thread.sleep(2000);
		 addCategorypage.verifyMonth();
		 Thread.sleep(2000);
		 addCategorypage.verifyEnteredName();
		 Thread.sleep(2000);
	
		 
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateCategoryName();
		 
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	}


	











