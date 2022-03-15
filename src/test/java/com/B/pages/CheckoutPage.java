package com.B.pages;

import org.openqa.selenium.By;
import com.A.common.BaseClass;

public class CheckoutPage {
	
	private By Checkoutlocator = By.xpath("//a[normalize-space()=\'Samsung Note 8\']");
	

	BaseClass obj=new BaseClass();

	public String Button(){
		 
		return obj.getDriver().findElement(Checkoutlocator).getText();
	}
	

}



