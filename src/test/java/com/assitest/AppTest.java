package com.assitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.get("https://basecopy5.staging.pg-test.com/");
	
	d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	d.findElement(By.xpath("//button[@aria-label='Sign up with Email']")).click();
	d.findElement(By.id("firstName")).sendKeys("Amit");
	d.findElement(By.id("lastName")).sendKeys("Kumar");
	d.findElement(By.id("email")).sendKeys("Ningraj95067@gmail.com");
	d.findElement(By.id("password")).sendKeys("Amit@123");
	d.findElement(By.id("agreementAccepted")).click();
	d.findElement(By.xpath("//button[@form='standard-email-signup-form']")).click();
	d.findElement(By.xpath("(//div[@class='ant-card-body'])[1]")).click();
	d.findElement(By.xpath("//button[@type='button']")).click();
	d.findElement(By.xpath("//span[text()='Creating content']")).click();
	d.findElement(By.xpath("//span[text()='Learning new languages']")).click();
	d.findElement(By.xpath("//span[text()='Music']")).click();
	d.findElement(By.xpath("(//button)[2]")).click();
	d.findElement(By.xpath("(//div[@class='capsule large-capsule'])[1]")).click();
	d.findElement(By.xpath("(//button)[2]")).click();
	d.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	d.findElement(By.xpath("(//div[@class='select__option'])[1]")).click();
	d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	Thread.sleep(4000);
	
	d.close();
}
	
}
