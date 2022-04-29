package Leetcode.esay.romanToInteger

class RomanToInteger {
    fun romanToInt(s: String): Int {
        if (s.isEmpty()) {
            return (0)
        }

        var prev: Int = symbolToInt(s.get(s.length - 1))
        var sum: Int = prev

        for (i in s.length-2 downTo 0) {
            var current = symbolToInt(s.get(i))

            if (current >= prev) {
                sum += current
            } else {
                sum -= current
            }
            prev = current
        }
        return sum
    }

    fun symbolToInt(symbol: Char): Int {
        when (symbol) {
            'I' -> return (1)
            'V' -> return (5)
            'X' -> return (10)
            'L' -> return (50)
            'C' -> return (100)
            'D' -> return (500)
            'M' -> return (1000)
        }
        return (0)
    }

}


fun main() {
    var solution: RomanToInteger = RomanToInteger()
    println(readLine()?.let { solution.romanToInt(it) })
}