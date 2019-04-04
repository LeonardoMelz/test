package com.elianogueira.desafioselenium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cadastro {

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
		public void fazerCadrastro() throws InterruptedException {
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[5]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"nameInput_27-input\"]")).sendKeys("Leonardo");
			driver.findElement(By.xpath("//*[@id=\"emailInput_52-input\"]")).sendKeys("Leonardo@seilaoq");
			driver.findElement(By.xpath("//*[@id=\"passwordInput_101-input\"]")).sendKeys("qualquercoisa");
			driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

				}
		
	
	  @After public void posCondicao() throws Exception { driver.quit(); }
	  
	 
}
