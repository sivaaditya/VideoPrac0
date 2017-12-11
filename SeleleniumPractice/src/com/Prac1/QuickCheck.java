package com.Prac1;
import org.openqa.selenium.firefox.FirefoxDriver;
public class QuickCheck { 
	public static void main(String []args) {
		System.out.println("launching FireFox browser");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//BrowserDrivers//geckodriver.exe");		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
	}
}

