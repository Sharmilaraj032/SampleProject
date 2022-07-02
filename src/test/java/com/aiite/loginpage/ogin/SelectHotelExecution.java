package com.aiite.loginpage.ogin;

import com.aiite.Baseclass.login.BaseClass;
import com.aiite.locators.login.LocatorsSelectHotel;

public class SelectHotelExecution extends LocatorsSelectHotel {
	public static void clickRadiobtn() {
		BaseClass.click(BaseClass.
				findByXpath(LocatorsSelectHotel.radiobtn));
	}
	public static void clickContinue() {
		BaseClass.click(BaseClass.findByID(LocatorsSelectHotel.continuebtn));
	}

}
