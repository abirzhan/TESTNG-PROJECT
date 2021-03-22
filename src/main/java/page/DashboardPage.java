package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class DashboardPage extends BasePage{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.LINK_TEXT,using ="Techfios")
	WebElement Category_Name;



    public void validateCategoryName() {
	
    waitForElement(driver, 5, Category_Name);
    
Assert.assertEquals(Category_Name.getText(), "Techfios", "Techfios category not found!!");


  
}
}
