package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	
	@Test(priority=1)
	public void titleTest() {
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Amazon.de";
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority=2)
	public void searchBarExitsTest() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(search.isDisplayed());
	}
	
	@Test(priority=3)
	public void signinLinkTest() {
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Assert.assertEquals(signin.getText(), "Hello, sign in");
	}

}
