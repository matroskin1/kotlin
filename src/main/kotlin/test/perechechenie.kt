//package test
//
//fun intersection(a: IntArray, b: IntArray): IntArray {
//
//    var k: Int = 9
//    var cC: Int = 0
//    var c: ArrayList<Int> = ArrayList()
//
//    for (i in 0 until a.size - 1) {
//        if (i < a.size) {
//            for (j in 0 until b.size - 1) {
//                if (a[i] == a[j]) {
//
//                    c.add(a[i])
//                    cC++
//                    break
//                }
//                k++
//            }
//
//        } else {
//            return IntArray(c.size, {i -> c.get(i)})
//        }
//    }
//    return c
//}
//
//fun listToIntArray(list: List<Int>): IntArray {
//    var result: IntArray = IntArray(list.size)
//
//    for (i in 0 until list.size) {
//        result[i] = list.get(i)
//    }
//    return result;
//}
//
//
//fun main() {
//    var a: IntArray = intArrayOf(1, 2, 3, 2)
//    var b: IntArray = intArrayOf(1, 2, 3, 4, 2)
//    var c: IntArray = intersection(a, b)
//
//    for (i in 0 until c.size) {
//        print("${c[i]} ")
//    }
//    // println()
//}
