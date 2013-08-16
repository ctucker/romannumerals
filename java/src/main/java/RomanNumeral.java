import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedMap;

public class RomanNumeral {

	private final static ImmutableSortedMap<Integer, String> numeralConversions =
			ImmutableSortedMap.<Integer, String>reverseOrder()
			                  .put(1000, "M")
			                  .put(900, "CM")
			                  .put(500, "D")
			                  .put(400, "CD")
			                  .put(100, "C")
			                  .put(90, "XC")
			                  .put(50, "L")
			                  .put(40, "XL")
			                  .put(10, "X")
			                  .put(9, "IX")
			                  .put(5, "V")
			                  .put(4, "IV")
			                  .put(1, "I")
			                  .build();

	private final int decimalValue;

	public RomanNumeral(int decimalValue) {
		Preconditions.checkArgument(decimalValue > 0);
		this.decimalValue = decimalValue;
	}

	public String asString() {
		return buildString(decimalValue);
	}

	private String buildString(int remaining) {
		for (Integer decimal : numeralConversions.keySet()) {
			if (remaining >= decimal) {
				return numeralConversions.get(decimal) + buildString(remaining - decimal);
			}
		}
		return "";
	}
}
