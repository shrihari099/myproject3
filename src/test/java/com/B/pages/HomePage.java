package com.B.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.A.common.BaseClass;

public class HomePage {
	WebDriver driver;
	private By shoplocator = By.xpath("//*[contains(@href,'/angularpractice/shop')]");
	
	BaseClass obj=new BaseClass();
	
	
	public void Shop() {
		obj.getDriver().findElement(shoplocator).click();
		}
	
	
}