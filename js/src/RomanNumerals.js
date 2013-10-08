var ROMAN_ONE = 'I';

var conversions = [
	{ 1 : 'I' },
	{ 5 : 'V' }
];


function integerToNumeral(intValue) {
	if (intValue === 0) {
		return '';
	}

	if (intValue >= 5) {
		return 'V' + integerToNumeral(intValue - 5);
	}

	return ROMAN_ONE + integerToNumeral(intValue - 1);
}



exports['integerToNumeral'] = integerToNumeral;