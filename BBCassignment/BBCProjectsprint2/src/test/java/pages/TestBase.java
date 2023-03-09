package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import configprop.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	ConfigFileReader cfr;

	@BeforeSuite
	public void initialise() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		cfr = new ConfigFileReader();
		driver.get(cfr.geturl());

	}

	@BeforeTest
	public void printBeforeTest() {
		System.out.println("Test Started");
	}

	@AfterTest
	public void printAfterTest() {
		System.out.println("Test Exited");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
