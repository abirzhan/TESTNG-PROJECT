package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCategoryPage extends BasePage{
	WebDriver driver;
	
	public AddCategoryPage (WebDriver driver) {
		 
			this.driver = driver;
		}
	
	//Element library
	@FindBy(how=How.NAME, using="categorydata")
	WebElement Category_Add_Field;
	//@FindBy(how=How.NAME, using="submit")
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/input[2]")
	WebElement Add_Category_Button;
	@FindBy(how = How.NAME, using= "due_month")
	WebElement Month_Field;
	@FindBy(how=How.LINK_TEXT,using ="Techfios")
	WebElement Category_Name;




    public void insertCategory(String category) {
     Category_Add_Field.sendKeys(category);
    }
    
    public void clickOnSubmit() {
    	Add_Category_Button.click();
    }
   
   
    	public void verifyMonth() {
	    WebElement month = driver.findElement(By.name("due_month"));
	    Select select = new Select(month);
	    List<WebElement>allOptions = select.getAllSelectedOptions();
	    for(int i =0; i<allOptions.size(); i++) {
	
	    System.out.println(i + month.getText());
	    }
    	}
    
	   public void verifyEnteredName() {

       String t = "Techfios";
       List<WebElement> l = driver.findElements(By.linkText("Techfios"));
       if(l.size()>0) {
    	   System.out.println("Text: " + t + "The category you want to add already exists: <duplicated category name>.");
       }else {System.out.println("Text: "+ t + " is not exist");
       }
	   }
	}

    
