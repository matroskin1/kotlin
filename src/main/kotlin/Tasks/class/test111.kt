package `class`

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var _nums: IntArray = nums
        var sum: Int = 0
        var k: Int
        var max = 0

        for (i in 0.._nums.size - 1) {
            //println(_nums[i])

            k = 0
            while (_nums.size - 1 - k >= i) {
                sum = 0
                for (j in _nums.size - 1 - k downTo i) {
                    // println("max1 ${_nums[j]}")
                    sum = sum + _nums[j]
                    // println(sum)
                }
                if (sum > max) {
                    max = sum
                    //  println("max2= $max")
                }
                k++
            }
        }


        //println(nums[2])
        return (max)
    }
}

fun main() {

    var a: Solution = Solution()
    var nums: IntArray = intArrayOf(-1)

    println(a.maxSubArray(nums))
}