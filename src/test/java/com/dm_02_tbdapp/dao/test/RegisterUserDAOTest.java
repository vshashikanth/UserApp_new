package com.dm_02_tbdapp.dao.test;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import com.dm_02_tbdapp.dao.RegisterUserDAO;

public class RegisterUserDAOTest {

	@Test
	public void testRegisterUser1() {
		RegisterUserDAO userObj=new RegisterUserDAO();
		//JSONObject jsonObj=userObj.registerUser("success");
		//assertNotNull(jsonObj);
	}
    
	@Test
	public void testRegisterUser2() {
		RegisterUserDAO userObj=new RegisterUserDAO();
	//	Object obj=userObj.registerUser("success");
	//	assertEquals("org.json.simple.JSONObject",obj.getClass().getName());
	}
}
