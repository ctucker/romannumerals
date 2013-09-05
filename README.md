Roman Numerals
==============

The system of Roman numerals represents the natural numbers using letters from the latin alphabet.
The values of the different letters are:

| Letter | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

Numbers are composed left-to-right by adding up the value of the letters to arrive at the desired number.  So,
for example, the number 3 is written "III", the number 52 is written LII, and the number 3572 is written MMMDLXXII.

There are six exceptions to this rule, where a sequence is written in a subtractive, rather than additive, form.
This avoids having 4 or more of the same letter in sequence.

* The number 4 is written as IV, not IIII (except on some clock faces!)
* The number 9 is written as IX, not VIIII
* The number 40 is written XL
* The number 90 is written XC
* The number 400 is written CD
* The number 900 is written CM

The goal of this kata is to write a class, RomanNumeral, that can convert an integer into a string of Roman numeral
characters.
