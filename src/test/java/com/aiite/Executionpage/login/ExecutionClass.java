package com.aiite.Executionpage.login;

import org.junit.Test;
import com.aiite.loginpage.ogin.HotelBookingExecution;
	public class ExecutionClass extends 
	HotelBookingExecution {
		@Test
		public void test() {
			loadDriver();
			loadurl(propertiesfile("url"));
			username();
			password();
			login();
			location();
			hotels();
			roomtype();
			noofrooms();
			checkin();
			checkout();
			adultroom();
			childroom();
			searchbutton();
			clickRadiobtn();
			clickContinue();
			firstname();
			lastname();
			address();
			cardnumber();
			cardtype();
			month();
			year();
			cvv();
			bookbtn();
			orderno();
			close();
		}
	}
