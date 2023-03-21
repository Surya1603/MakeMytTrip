package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Surya\\\\eclipse-workspace\\\\SelChallenge1\\\\Driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	   driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).sendKeys("Sathiya");
       
	   driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("Prakash");
	   
	   driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).sendKeys("45,IndraNagar,Coimbatore");
	  
	   driver.findElement(By.xpath("//*[@id=\'eid\']/input")).sendKeys("prakash9@gmail.com");
	   
	   driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input")).sendKeys("9874656548");
	   
	   driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input")).click();
	   
	   driver.findElement(By.id("checkbox1")).click();
	 
	   driver.findElement(By.xpath("//*[@id=\'Skills\']/option[4]")).click();    
	   WebElement find = driver.findElement(By.id("yearbox"));
	   Select s = new Select(find);
	   s.selectByValue("1997");
	   WebElement ele = driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[11]/div[2]/select"));
	   Select s1 = new Select(ele);
	   s1.selectByValue("March");
	   WebElement w =driver.findElement(By.id("daybox"));
	   Select s2 = new Select(w);
	   s2.selectByValue("15");
	   
	   driver.findElement(By.id("firstpassword")).sendKeys("123005qwe");
	   
	   driver.findElement(By.id("secondpassword")).sendKeys("123005qwe");
	   
	   driver.findElement(By.id("submitbtn")).click();
	   
	  
	   
	   
	}

}
