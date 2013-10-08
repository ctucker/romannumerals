var converter = require('../src/RomanNumerals');

describe('Integer to Roman Numeral conversion', function() {

	it('should convert 1 to the letter I', function() {
		expect(converter.integerToNumeral(1)).toBe("I");
	})

});
