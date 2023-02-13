package com.bl.test.mavenproject;
	import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

	@RunWith(Parameterized.class)
	public class ParameterizedEmailTest {
	 private String email;
	  private boolean expected;
	public ParameterizedEmailTest(String email, boolean expected) {
		super();
		this.email = email;
		this.expected = expected;
	}
	@Parameterized.Parameters
	  public static Collection input() {
		  return  Arrays.asList(new Object[][] {{"abc.axr@gmail.com",true},{"ab.axr@gmail.com",true},{"abc.100@abc.com.au",true},
			  {"abc..2002@gmail.com",false},{"abc@gmail.com.aa.au",false}});
		  }
	  
	@Test
	public void parameterizedEmail() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.isValidAllEmailSamples(this.email);
	    assertEquals(this.expected, result);
	}
}
