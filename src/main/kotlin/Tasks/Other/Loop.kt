fun printTableFor() {
    for (n in 1..9) {
        for (t in 1..9) {
            print("${n}*${t}=${n * t} \t")
        }
        println()
    }
}

fun printTableWhile() {
    var n = 1
    while (n <= 9) {
        var t = 1
        while (t <= 9) {
            print("${n}*${t}=${n * t}\t\t")
            t++
        }
        println()
        n++
    }
}

fun printTableDoWhile(){

}

fun main() {
    printTableWhile()
}




