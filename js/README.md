# Cheat sheet

An interesting exercise for this kata is to code the solution using *no reassignment*.  You must treat all variables as write-once, immutable values.

For example, this is acceptable:

	var x = 10;
	var y = x * 2;

but this is not:

	var x = 10;
	x = x * 2;

A loop requires variable reassignment, so loops are out!  This is not allowed:

	for (var i = 0; i < 10; i++) {
		// ...
	}

Because it requires the `i` variable be reassigned on each iteration.  Instead, you should use the `Array` object's list operators.

Further, arrays and objects can't be modified after they're created.  So, this is OK:

```javascript
var x = [1,2,3];
var y = { a: 1, b: 2 }
```

but this is not:

```javascript
var x = [];
x.push(1);
x.push(2);

var y = {};
y.a = 1;
y.b = 2;
```

## Iteration

To iterate over the elements in an array, use `Array.prototype.forEach`:

```javascript
var myArray = [1,2,3];
myArray.forEach(function(element) {
	console.log(element);
});
```

rather than the classic for loop:

```javascript
var myArray = [1,2,3];
for (var i = 0; i < myArray.length; i++) {
	console.log(myArray[i]);
}
```

## Transformation

To transform the elements of an array into a different array, use `Array.prototype.map`:

```javascript
var myArray = [1,2,3];
var myDoubledArray = myArray.map(function(element) {
	return element * 2;
});
```

rather than using a temporary array:

```javascript
var myArray = [1,2,3];
var myDoubledArray = [];
for (var i = 0; i < myArray.length; i++) {
	myDoubledArray.push(myArray[i] * 2;
}
```

## Filtering

To select just some elements from an array, use `Array.prototype.filter`:

```javascript
var myArray = [1,2,3];
var odds = myArray.filter(function(element) {
	return element % 2 == 1;
})
```

rather than using a temporary array:

```javascript
var myArray = [1,2,3];
var odds = [];
for (var i = 0; i < myArray.length; i++) {
	if (myArray[i] % 2 == 1)
		odds.push(myArray[i]);
}
```

## Reduction (folding)

To compute an aggregate from an array (e.g. getting the sum of its entries) use `Array.prototype.reduce`:

```javascript
var myArray = [1,2,3];
var sum = myArray.reduce(function(memo, element) {
	return memo + element;
});
```

rather than using a temporary accumulator:

```javascript
var myArray = [1,2,3];
var sum = 0;
for (var i = 0; i < myArray.length; i++) {
	sum += myArray[i];
}
```

