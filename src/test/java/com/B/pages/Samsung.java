package com.B.pages;

import org.openqa.selenium.By;
import com.A.common.BaseClass;

public class Samsung {
	private By SamButtonlocator = By.
			xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[2]/div/div[2]/button");
	private By Checkoutlocator = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li/a");

	BaseClass obj=new BaseClass();

	public void SamsungMobile(){
		 obj.getDriver().findElement(SamButtonlocator).click();
		 obj.getDriver().findElement(Checkoutlocator).click();
	}
	}
	





