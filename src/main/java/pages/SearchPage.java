package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class SearchPage extends Base{
	

	WebElement txtFirstNameSearch=driver.findElement(By.cssSelector(".input-sm.form-control.ng-isolate-scope"));
	WebElement txtGlobalSearch=driver.findElement(By.cssSelector(".input-sm.form-control.ng-isolate-scope"));
	
	public void search(String text)
	{
		txtFirstNameSearch.sendKeys(text);
	}
}
