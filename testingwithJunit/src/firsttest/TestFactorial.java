package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class TestFactorial {
	
	@BeforeClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("After executing all test cases");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("After executing all test cases");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("Before executing all test cases");
	}
	

}
