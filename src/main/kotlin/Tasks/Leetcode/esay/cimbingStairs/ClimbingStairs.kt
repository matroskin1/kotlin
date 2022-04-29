package Leetcode.esay.cimbingStairs

import java.math.BigInteger

class Solution {

    fun factorial(num: Int): BigInteger {
        var result: BigInteger = BigInteger("1")
        for (i in 2..num)
            result = result.multiply(BigInteger(i.toString()))
        return result
    }

    fun climbStairs(n: Int): Int {
        var result: Int = 1;
        var quantityTwo: Int = 0;
        var quantityOne: Int = n;

        while (quantityTwo < n / 2) {
            quantityTwo++;
            quantityOne -= 2;
            var n1 = factorial(quantityTwo + quantityOne)
            var nMinusK = factorial(quantityOne)
            var k = factorial(quantityTwo)
            result += n1.divide(nMinusK.multiply(k)).toInt()
        }
        return result
    }
}

fun main() {
    var solution: Solution = Solution()
    println("1 - ${solution.climbStairs(1)}")
    println("2 - ${solution.climbStairs(2)}")
    println("3 - ${solution.climbStairs(3)}")
    println("4 - ${solution.climbStairs(4)}")
    println("5 - ${solution.climbStairs(5)}")
    println("6 - ${solution.climbStairs(6)}")
    println("7 - ${solution.climbStairs(7)}")
    println("8 - ${solution.climbStairs(8)}")
    println("44 - ${solution.climbStairs(44)}")
    println("45 - ${solution.climbStairs(45)}")

}