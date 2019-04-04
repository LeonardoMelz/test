package com.elianogueira.desafioselenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

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
	public void fazerLogin() throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"emailInput_27-input\"]")).sendKeys("sadsa");
		driver.findElement(By.xpath("//*[@id=\"passwordInput_38-input\"]")).sendKeys("sajsda");
		driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button/span")).click();
	}
	
	@After
	public void posCondicao() throws Exception {
		//driver.quit();
	}

}
