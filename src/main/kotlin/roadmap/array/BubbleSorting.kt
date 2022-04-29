package roadmap.array

fun bubbleSorting(array: IntArray): IntArray {

    for (i in 0 until array.size - 1) {
        for (j in i until array.size - 1) {
            if (array[j] > array[j + 1]) {
                val a: Int = array[j]
                array[j] = array[j + 1]
                array[j + 1] = a
            }
        }
    }
    return array
}

fun main() {
    val array: IntArray = intArrayOf(1, 3, 3, 4, 8, 7, 6)
    bubbleSorting(array)
    for (i in 0 until array.size) {
        print("${array[i]} ")
    }
}