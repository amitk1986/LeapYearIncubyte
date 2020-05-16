import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@DisplayName("LeapYearTest")
class LeapYearTestTest {

	@DisplayName("checking all years not divisible by 4 are not leap years")
    @ParameterizedTest
    @ValueSource(ints = {2017,2018,2019})
	void leapTest(int years) {
		assertFalse(new LeapYearTest().leapTest(years));
	}
	
	@DisplayName("checking all years divisible by 4 but not by 100 are leap years")
    @ParameterizedTest
    @ValueSource(ints = {2008,2012,2016})
	void LeapTest2(int years) {
		assertTrue(new LeapYearTest().leapTest(years));
	}
	
	@DisplayName("checking all years divisible by 100 but by 400 are not leap years")
    @ParameterizedTest
    @ValueSource(ints = {1700,1800,1900,2100})
	void LeapTest3(int years) {
		assertFalse(new LeapYearTest().leapTest(years));
	}
	
	@DisplayName("checking all years divisible by 4000 are not leap years")
    @ParameterizedTest
    @ValueSource(ints = {4000,8000})
	void LeapTest4(int years) {
		assertFalse(new LeapYearTest().leapTest(years));
	}
}
