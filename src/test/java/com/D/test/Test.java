package com.D.test;
import com.A.common.BaseClass;
import com.B.pages.CheckoutPage;
import com.C.views.CheckoutPageView;
import com.C.views.HomepageView;
import com.C.views.SamsungView;

public class Test {
	
public static void main(String[] args) throws InterruptedException {
	
	
	BaseClass obj=new BaseClass();
	obj.setDriver();
	obj.browser();
	
	HomepageView obj2=new HomepageView();
	obj2.navigate();
	
	SamsungView obj3=new SamsungView();
	obj3.Verify();
	
	CheckoutPageView obj4= new CheckoutPageView();
	obj4.verify2();
	
	
	
}
}
