package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.SearchPage;

public class SearchPageTest extends Base {

	public SearchPage s;
	@BeforeMethod
public void setup()
{
	initialization();
	driver.navigate().to(prop.getProperty("url1"));
	s=new SearchPage();
	
}
@Test
	public void firstNameSearch()
	{
		s.search("Robert");
	}
@Test
public void ffirstNameSearch2()
{
	s.search("Meesha");
}

@Test
public void tfirstNameSearch3()
{
	s.search("mkk");
}
}
