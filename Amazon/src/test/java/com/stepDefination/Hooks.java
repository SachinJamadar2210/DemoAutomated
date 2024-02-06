package com.stepDefination;
import org.junit.After;
import com.helperclass.HelperClass;
import io.cucumber.java.Before;
public class Hooks {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void teardown() {
		HelperClass.teardown();
	}
	

}
