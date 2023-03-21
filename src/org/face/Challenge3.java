package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Surya\\\\eclipse-workspace\\\\SelChallenge1\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement find = driver.findElement(By.name("q"));
		find.sendKeys("https://en-gb.facebook.com/");
		find.submit();
		
		WebElement c = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[1]/td/div/h3/a"));
	    c.click();
	    
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("surya160398@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("163surya");
	    driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).submit();
	    
	}
}

