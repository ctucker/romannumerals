var conversions = [
	numeral(1, 'I'),
	numeral(4, 'IV'),
	numeral(5, 'V'),
	numeral(10, 'X'),
].reverse();

function integerToNumeral(intValue) {

	if (intValue === 0)
		return '';

	var chosenConverter = conversions.filter(function(converter) {
		return intValue >= converter.asInt
	})[0];

	return chosenConverter.asRoman + integerToNumeral(intValue - chosenConverter.asInt);
}

function numeral(asInt, asRoman) {
	return {
		asInt : asInt,
		asRoman : asRoman
	}
}

exports['integerToNumeral'] = integerToNumeral;