import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IntegerToRomanNumeralTest {

	@Test
	public void decimal_1_is_roman_i() {
		verifyConversion(1, "I");
	}

	@Test
	public void decimal_2_is_roman_ii() {
		verifyConversion(2, "II");
	}

	@Test
	public void decimal_5_is_roman_v() {
		verifyConversion(5, "V");
	}

	@Test
	public void decimal_6_uses_additive_case_to_get_vi() {
		verifyConversion(6, "VI");
	}

	@Test
	public void decimal_4_uses_subtractive_case_to_get_iv() {
		verifyConversion(4, "IV");
	}

	@Test
	public void decimal_10_is_roman_x() {
		verifyConversion(10, "X");
	}

	@Test
	public void decimal_12_uses_additive_case_to_get_xii() {
		verifyConversion(12, "XII");
	}

	@Test
	public void decimal_20_uses_repetitive_case_to_get_xx() {
		verifyConversion(20, "XX");
	}

	@Test
	public void decimal_9_uses_subtractive_case_to_get_ix() {
		verifyConversion(9, "IX");
	}

	@Test
	public void decimal_14_uses_additive_on_ten_and_subtractive_on4_to_get_xiv() {
		verifyConversion(14, "XIV");
	}

	@Test
	public void decimala50IsRomanL() {
		verifyConversion(50, "L");
	}

	@Test
	public void decimal_40_uses_subtractive_case_to_get_XL() {
		verifyConversion(40, "XL");
	}

	@Test
	public void decimal_44_uses_subtractive_additive_and_subtractive_to_get_XLIV() {
		verifyConversion(44, "XLIV");
	}

	@Test
	public void decimal_100_is_roman_C() {
		verifyConversion(100, "C");
	}

	@Test
	public void decimal_90_uses_subtractive_case_to_get_XC() {
		verifyConversion(90, "XC");
	}

	@Test
	public void decimal_500_is_roman_D() {
		verifyConversion(500, "D");
	}

	@Test
	public void decimal_400_uses_subtractive_case_to_get_CD() {
		verifyConversion(400, "CD");
	}

	@Test
	public void decimal_1000_is_roman_M() {
		verifyConversion(1000, "M");
	}

	@Test
	public void decimal_900_uses_subtractive_case_to_get_CM() {
		verifyConversion(900, "CM");
	}

	@Test
	public void simple_repetitions_through_all_concatenate_together() {
		verifyConversion(3786, "MMMDCCLXXXVI");
	}

	@Test
	public void multiple_repeated_subtractions_concatenate_together() {
		verifyConversion(944, "CMXLIV");
	}

	@Test
	public void mixture_of_additions_and_subtractions_concatenate_together() {
		verifyConversion(1951, "MCMLI");
	}

	@Test(expected = IllegalArgumentException.class)
	public void conversion_of_non_integer_throws_IAE() {
		verifyConversion(-1, "ERROR");
	}

	private void verifyConversion(int decimal, String expected) {
		assertThat(new RomanNumeral(decimal).asString(), is(equalTo(expected)));
	}


}
