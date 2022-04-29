package Hackerrank.easy


fun polydrome(x: Int): Boolean {
    var r: Int = 0
    var _x: Int = x
    if (x % 10 == 0 && x != 0) {
        return (false)
    }
    while (_x > r) {
        r = r * 10 + _x % 10
        _x = _x / 10
    }
    if (r / 10 == _x || _x == r) {
        return (true)
    }
    return (false)
}


fun main () {
    var x: Int = readLine()!!.toInt()
    var a: Boolean
    a = polydrome(x)
    println(a)

}