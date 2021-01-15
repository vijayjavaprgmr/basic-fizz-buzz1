import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.bnpp.kata.BasicFizzBuzzGame;

public class BasicFizzBuzzTest {
	@Test
	public void testNormalNumbersReturnSameNumber() {
		BasicFizzBuzzGame basicFizzBuzz = new BasicFizzBuzzGame();
		assertThat(basicFizzBuzz.getFizzBuzzScore(1), is("1"));
	}

	@Test
	public void testMultiplesofThreeReturnFizz() {
		BasicFizzBuzzGame basicFizzBuzz = new BasicFizzBuzzGame();
		assertThat(basicFizzBuzz.getFizzBuzzScore(123), is("fizz"));
	}
}