package Leetcode.esay


class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.get(digits.size - 1) < 9) {
            digits.set(digits.size - 1, digits.get(digits.size - 1) + 1)
            return (digits)
        } else {
            for (i in digits.size - 1 downTo 0) {
                if (i == 0 && digits[i] == 9) {
                    var arr = IntArray(digits.size + 1, {0});
                    arr[0] = 1;
                    return arr;
                } else if (digits[i] == 9) {
                    digits[i] = 0;
                } else if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
        }
        return (digits)
    }
}

fun main() {
    var solution: Solution = Solution()
    var digits: IntArray = intArrayOf(9, 9, 9)
    var rezut: IntArray = solution.plusOne(digits)

    for (i in 0 until rezut.size) {
        println(rezut[i])
    }
}