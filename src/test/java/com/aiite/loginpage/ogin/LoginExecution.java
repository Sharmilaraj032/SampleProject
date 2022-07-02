package com.aiite.loginpage.ogin;

import com.aiite.Baseclass.login.BaseClass;
import com.aiite.locators.login.LocatorsLogin;

public class LoginExecution extends LocatorsLogin {

		public static void username() {
			BaseClass.typeData(BaseClass.findByID(LocatorsLogin.username), 
					BaseClass.propertiesfile("userid"));
		}
		public static void password() {
			BaseClass.typeData(BaseClass.findByID(LocatorsLogin.password), 
					BaseClass.propertiesfile("password"));
		}
		public static void login() {
			BaseClass.click(BaseClass.findByID(LocatorsLogin.login));
		}
}
