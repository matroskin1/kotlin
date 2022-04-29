//package singleNumber
//
//class Solution {
//    fun singleNumber(nums: IntArray): Int {
//        var map: HashMap<Int, Int> = HashMap()
//
//        for (i in 0 until nums.size - 1) {
//            if (map.containsKey(nums[i])) {
//                map.set(nums[i], map.get(nums[i])!! + 1 )
//            } else {
//                map.put(nums[i], 1)
//            }
//        }
//        var entities: Enti = map.e
//
//        return result
//    }
//}
//
//
//fun main() {
//    var a: Solution = Solution()
//    var b: IntArray = intArrayOf(4, 2, 1, 3, 2, 3, 4)
//    println(a.singleNumber(b))
//
////    var map: HashMap<Int, String> = HashMap()
////
////    map.put(1, "January");
////    map.put(2, "awkjdbawd");
//
//
//}