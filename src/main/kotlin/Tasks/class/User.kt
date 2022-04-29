package `class`

class User {
    var name: String
    var lastName: String
    var age: Int

    constructor(name: String) {
        this.name = name
        this.lastName = "lox"
        this.age = 12
    }

    constructor(name: String, lastName: String, age: Int) : this(name) {
        println(name)
       this.lastName = lastName
//        this.age = age
    }

    fun printInfo() {
        println(" ${name} ${lastName} age: ${age}")
    }

}

fun main() {


    var user1 = User("User1", "Userovich1", 26)
    var user2 = User("User2")

    var arr: Array<User> = Array(1000, {User("User2")})

    for (i in 0 until 1000) {
        arr.get(i).name = "${i*10}robott"
        arr.get(i).lastName = "${i}r"
        arr.get(i).printInfo()

    }

//    var list: ArrayList<User> = ArrayList()

//
//    user1.printInfo()
//    user2.printInfo()
//    println(2/0)


}
