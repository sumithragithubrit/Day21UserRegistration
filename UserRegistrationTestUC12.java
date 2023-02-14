package com.bl.test.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegistrationTestUC12 {
	UserRegistrationUC12 ur = new UserRegistrationUC12();
	@Test
	public void isValidUserFirstname() throws InvalidUserException{
		try {
			boolean actual = ur.isValidUserFirstname("Sumi@thrcxca");
		}catch(InvalidUserException e) {
			assertEquals(InvalidUserException.enumType.FIRSTNAME,e.type);
		}
	}
	@Test
	public void isValidUserLastname(){
		try {
			boolean actual = ur.isValidUserLastname("bhgftdf");
		}catch(InvalidUserException e) {
			assertEquals(InvalidUserException.enumType.LASTNAME,e.type);
		}
	}
	@Test
	public void isValidUserEmail(){
		try {
			boolean actual = ur.isValidEmail(".abc@gmail.com");
		}catch(InvalidUserException e) {
			assertEquals(InvalidUserException.enumType.EMAIL,e.type);
		}
	}
	@Test
	public void isValidUserMobileFormat(){
		try {
			boolean actual = ur.isValidMobileFormat("1234568952576");
		}catch(InvalidUserException e) {
			assertEquals(InvalidUserException.enumType.MOBILENUMBER,e.type);
		}
	}
	@Test
	public void isValidUserPassword(){
		try {
			boolean actual = ur.isValidPassword("@bhfhg56576");
		}catch(InvalidUserException e) {
			assertEquals(InvalidUserException.enumType.PASSWORD,e.type);
		}
	}
}
