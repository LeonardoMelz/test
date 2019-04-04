package com.elianogueira.desafioselenium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Busca {

	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@Before
	public void preCondicao() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Desktop\\leonardo\\chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);

		driver.get("https://www.coursera.org/");
		}

		@Test 
		public void fazerBusca() throws InterruptedException {
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/div/div/ul/li[1]/div/a/div/div/div[1]/img[1]")).click();
		}
		
	
	  @After public void posCondicao() throws Exception { driver.quit(); }
	  
	 }
