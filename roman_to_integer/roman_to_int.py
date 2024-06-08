class Solution:
    def romanToInt(self, s: str) -> int:
        roman_to_integer_mapping = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        length = len(s)
        i = length - 1
        sum = 0
        while i >= 0:
            if i < length - 1 and roman_to_integer_mapping[s[i]] < roman_to_integer_mapping[s[i + 1]]:
                sum = sum - roman_to_integer_mapping[s[i]]
            else:
                sum = sum + roman_to_integer_mapping[s[i]]
            i = i - 1
        return sum