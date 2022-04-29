fun printSquare(length: Int, width: Int) {
    var line: Int = 1

    for (i in 1..length) {
        for (j in 1..width){
            if (line == 1){
                print('$')
            }
            if (line == 2){
                print('*')
            }
            if (line == 3){
                print('%')
            }
        }
        if (line == 3){
            line = 1
        } else{
            line++
        }
        println()

    }
}

fun main() {
    println("Enter length ana width")
    var length: Int = readLine()!!.toInt()
    var width: Int = readLine()!!.toInt()
    println("Enter symbol")
    // val symbol: String = readLine()!!

    printSquare(length, width)
}