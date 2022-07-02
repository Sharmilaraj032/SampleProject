package com.aiite.loginpage.ogin;

import com.aiite.Baseclass.login.BaseClass;
import com.aiite.locators.login.LocatorsHotelBooking;

public class HotelBookingExecution extends LocatorsHotelBooking {
		public static void firstname() {
			BaseClass.typeData(BaseClass.findByName(LocatorsHotelBooking.firstname), BaseClass.excelRead(8, 2));
		}
		public static void lastname() {
			BaseClass.typeData(BaseClass.findByName(LocatorsHotelBooking.lastname), BaseClass.excelRead(9, 2));
		}
		public static void address() {
			BaseClass.typeData(BaseClass.findByXpath(LocatorsHotelBooking.address), BaseClass.excelRead(10, 2));
		}
		public static void cardnumber() {
			BaseClass.typeData(BaseClass.findByID(LocatorsHotelBooking.cardnumber), BaseClass.excelRead(11, 3));
		}
		public static void cardtype() {
			BaseClass.typeData(BaseClass.findByID(LocatorsHotelBooking.cardtype), BaseClass.excelRead(12, 3));
		}
		public static void month() {
			BaseClass.typeData(BaseClass.findByID(LocatorsHotelBooking.month), BaseClass.excelRead(13, 2));
		}
		public static void year() {
			BaseClass.typeData(BaseClass.findByID(LocatorsHotelBooking.year), BaseClass.excelRead(13, 3));
		}
		public static void cvv() {
			BaseClass.typeData(BaseClass.findByName(LocatorsHotelBooking.cvv), BaseClass.excelRead(14, 2));
		}
		public static void bookbtn() {
			BaseClass.click(BaseClass.findByXpath(LocatorsHotelBooking.bookbtn));
		}
		public static void orderno() {
			BaseClass.scroll(0, 1500);
			String attribute = BaseClass.getAttribute(BaseClass.findByID(LocatorsHotelBooking.orderno), "value");
			BaseClass.excelWrite(attribute);
		}

}
