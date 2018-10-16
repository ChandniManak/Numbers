package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "one", numberWords.toWords(1) ) ;
	}
	
	@Test
	public void number999ReturnsNineHundredNinetyNine() {
		Assert.assertEquals( "nine hundred ninety nine", numberWords.toWords(999) ) ;
	}
	
	@Test
	public void invalidNumberErrorMessage() {
		Assert.assertEquals( "Invalid Number", numberWords.toWords(-1) ) ;
	}
	
	@After
	public void teardown() {
		System.gc();
		
	}

}

