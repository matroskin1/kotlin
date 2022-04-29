fun fillMatrix(length: Int, width: Int): Array<Array<Char>> {
    val matrix: Array<Array<Char>> = Array(length, { Array(width, { '*' }) })
    return (matrix)
}

fun printMatrix(matrix: Array<Array<Char>>) {
    for (i in 0..matrix.size - 1) {
        for (j in 0..matrix[i].size - 1) {

            if( j < matrix[i].size-i-1){
                 print(" ")

            } else{
                print(matrix[i][j])
            }
        }
        println()
    }
}
fun flipPrintMatrix(){

}


fun main() {
    println("Введите длинну:")
    val length = 5
    println("Введите ширину:")
    val width = 5
    val mat = fillMatrix(length, width)
    printMatrix(mat)
}