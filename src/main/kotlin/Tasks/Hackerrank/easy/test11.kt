class Solution {
    fun removeElement(nums: IntArray, vall: Int): Int {
        var _vall: Int = vall
        var k: Int = 0

        for (i in nums.size-1 downTo 0){

            if (nums[i] == _vall){
                nums[i] = -1
                var c: Int = nums[nums.size-1-k]
                nums[nums.size-1-k] = nums[i]
                nums[i] = c
                k++
            }
        }


        return k

    }
    fun printArray(ar: IntArray) {
        for (i in 0 until ar.size) {
            print("${ar[i]} " )
        }
    }
}


fun main(){
    var a: Solution = Solution()
    var nums: IntArray = intArrayOf(2, 1, 2, 3, 4, 2)
    var vall: Int = 2

    println(a.removeElement(nums, vall))
    a.printArray(nums)

}