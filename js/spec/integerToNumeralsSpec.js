var converter = require('../src/RomanNumerals');

describe('Integer to Roman Numeral conversion', function() {

	it('should convert 1 to the letter I', function() {
		expect(converter.integerToNumeral(1)).toBe("I");
	});

	it('should convert 3 to the sequence III', function() {
		expect(converter.integerToNumeral(2)).toBe('II');
	});

	it('should convert 5 to the letter V', function() {
		expect(converter.integerToNumeral(5)).toBe('V');
	});

	it('should convert 6 to the sequence VI', function() {
		expect(converter.integerToNumeral(6)).toBe('VI');
	});

});
