var conversions = [
	numeral(1, 'I'),
	numeral(4, 'IV'),
	numeral(5, 'V'),
	numeral(10, 'X'),
].reverse();

function integerToNumeral(intValue) {

	if (intValue === 0)
		return '';

	var chosenConverter = applicableConverter(conversions);

	return chosenConverter.asRoman + integerToNumeral(intValue - chosenConverter.asInt);

	function applicableConverter(conversions) {
		var x = head(conversions),
			ys = tail(conversions);
		return intValue >= x.asInt ? x : applicableConverter(ys);
	}

	function head(arr) {
		return arr[0];
	}

	function tail(arr) {
		return arr.slice(1);
	}
}

function numeral(asInt, asRoman) {
	return {
		asInt : asInt,
		asRoman : asRoman
	}
}

exports['integerToNumeral'] = integerToNumeral;