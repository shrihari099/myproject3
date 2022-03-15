package com.C.views;

import com.B.pages.CheckoutPage;

public class CheckoutPageView {
	
CheckoutPage obj=new CheckoutPage();

public void verify2() {
	String a=obj.Button();
	if(a.contains("Samsung Note 8")) {
		System.out.println("Hence Verified and "+a+" is present");
	}
	else {
		System.out.println("Hence Verified and "+a+" is not present");
	}
}
}
