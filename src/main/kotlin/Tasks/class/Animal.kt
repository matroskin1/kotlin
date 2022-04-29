package `class`
//constructor(_name: String, _age: String, _color: String, _voice: String)
class Animal {

    var name: String = ""
    var age: Int = 0
    var color: String = ""
    var voice: String = ""

    fun info() {
        println("name: $name age: $age color: $color")
    }
    fun sayVoice () {
        println(voice)
    }
}