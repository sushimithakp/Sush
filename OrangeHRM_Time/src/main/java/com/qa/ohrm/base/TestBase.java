package com.qa.ohrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public static Properties prop;
	public static WebDriver driver;

	public static void initialization() 
	{
		loadFile();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public static void loadFile()
	{
		FileInputStream ip;
		try 
		{
			
			ip = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time\\src\\main\\java\\com\\qa\\ohrm\\config\\config.properties");
			prop = new Properties();
			prop.load(ip);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}

	}

}
