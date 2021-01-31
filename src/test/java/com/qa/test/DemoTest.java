package com.qa.test;

/*
@author: sachin jagtap

*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

//	WebDriver driver;
	@Test
	public void sum() {
		System.out.println("Sum");
		int a = 10;
		int b = 20;
//		System.setProperty("webdriver.chrome.driver", "D:\\DOCUMENTS\\SELENIUM JAR FILE AND CHORME DRI\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.quit();
		Assert.assertEquals(30, a + b);

	}

	@Test
	public void sub() {
		System.out.println("sub");
		int a = 10;
		int b = 20;
//		System.setProperty("webdriver.chrome.driver", "D:\\DOCUMENTS\\SELENIUM JAR FILE AND CHORME DRI\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.quit();
		Assert.assertEquals(10, b - a);

	}

	@Test
	public void div() {
		System.out.println("Div");
		int a = 10;
		int b = 20;
//		System.setProperty("webdriver.chrome.driver", "D:\\DOCUMENTS\\SELENIUM JAR FILE AND CHORME DRI\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.quit();
		Assert.assertEquals(2, b / a);

	}

	@Test
	public void mul() {
		System.out.println("Mul");
		int a = 10;
		int b = 20;
//		System.setProperty("webdriver.chrome.driver", "D:\\DOCUMENTS\\SELENIUM JAR FILE AND CHORME DRI\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.quit();
		Assert.assertEquals(200, a * b);

	}

}
