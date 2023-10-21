package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPage_locator;

public class LoginPage_PageExe extends LoginPage_locator{
	
	public static void username() {
		BaseClass.inputValue(LoginPage_locator.get_Username(), "testione");
	}
	
	public static void passeword() {
		BaseClass.inputValue(LoginPage_locator.get_password(), "testione");
	}
	
	public static void loginButton() {
		BaseClass.click_Value(LoginPage_locator.get_password());
	}

}
