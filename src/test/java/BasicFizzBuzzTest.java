import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.bnpp.kata.BasicFizzBuzzGame;

public class BasicFizzBuzzTest {
	BasicFizzBuzzGame basicFizzBuzz = null;

	@Before
	public void initializeBasicFizzBuzzGameObj() {
		basicFizzBuzz = new BasicFizzBuzzGame();
	}

	@Test
	public void testNormalNumbersReturnSameNumber() {
		assertThat(basicFizzBuzz.getFizzBuzzScore(1), is("1"));
	}

	@Test
	public void testMultiplesofThreeReturnFizz() {
		assertThat(basicFizzBuzz.getFizzBuzzScore(123), is("fizz"));
	}
}