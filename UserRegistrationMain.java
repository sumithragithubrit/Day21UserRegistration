package com.lamdaexpressions;

import java.util.function.Predicate;

public class UserRegistrationMain {
	public static void main(String[] args) {
		   System.out.println("Firstname :");
        Predicate<String> firstName = i ->i.matches("^[A-Za-z]{3,26}$");
        System.out.println(firstName .test("Sumithra"));
        
        System.out.println("Lastname :");
        Predicate<String> lastName = i ->i.matches("^[A-Za-z]{3,26}$");
        System.out.println( lastName.test(""));
        
        System.out.println("Email :");
        Predicate<String> email = i ->i.matches("abc[.][a-z]{3}@bl[.]co[.][a-z]{2}");
        System.out.println( email.test("abc.xyz@bl.co.in"));
        
        System.out.println("MobileNumber :");
        Predicate<String> mobilenumber = i ->i.matches("^(91 )([0-9]{10})$");
        System.out.println( mobilenumber.test("91 7897654325"));
        
        System.out.println("Password :");
        Predicate<String> password = i ->i.matches("^([aA-zZ]{8,})[0-9]{3}[@$+&*]{1}$");
        System.out.println( password.test("Sumithra657@"));
	}

}
