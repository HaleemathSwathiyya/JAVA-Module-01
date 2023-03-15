package paramtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.Parameterized;
//import org.junit.runner.Runwith;

import org.junit.Test;

public class PrimeNumberTest {
	
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber primeNumber;
	
    @Before
    public void initialise() {
    	PrimeNumber primenumber = new PrimeNumber();
    }
	
	public PrimeNumberTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false},
			{10,true}}
		);
		}
	

@test
public void testValidator() {
	System.out.println("Parameterized number is" + inputNumber);
	assertEquals(expectedResult,primeNumber.Validate(inputNumber));
}

}
