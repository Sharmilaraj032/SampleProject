package com.aiite.loginpage.ogin;

import com.aiite.Baseclass.login.BaseClass;
import com.aiite.locators.login.LocatorsHotel;

public class HotelExecution extends LocatorsHotel{
		
		public static void location() {
				BaseClass.typeData(BaseClass.findByID(LocatorsHotel.location), BaseClass.excelRead(1, 2));
			}
		public static void hotels() {
			BaseClass.typeData(BaseClass.findByID(LocatorsHotel.hotels), BaseClass.excelRead(2, 2));
		}
		public static void roomtype() {
			BaseClass.typeData(BaseClass.findByXpath(LocatorsHotel.roomtype), BaseClass.excelRead(3, 2));
		}
		public static void noofrooms() {
			BaseClass.typeData(BaseClass.findByXpath(LocatorsHotel.noofrooms), BaseClass.excelRead(4, 2));
		}
		public static void checkin() {
			BaseClass.clear(findByName(LocatorsHotel.checkin));
			BaseClass.typeData(BaseClass.findByName(LocatorsHotel.checkin), BaseClass.excelRead(5, 2));
			
		}
		public static void checkout() {
			BaseClass.clear(findByName(HotelExecution.checkout));
			BaseClass.typeData(BaseClass.findByName(HotelExecution.checkout), BaseClass.excelRead(5, 3));
		}
		public static void adultroom() {
			BaseClass.typeData(BaseClass.findByID(HotelExecution.adultroom), BaseClass.excelRead(6, 2));
		}
		public static void childroom() {
			BaseClass.typeData(BaseClass.findByID(HotelExecution.childroom), BaseClass.excelRead(7, 2));
		}
		public static void searchbutton() {
			click(BaseClass.findByXpath(HotelExecution.searchbutton));
		}

}
