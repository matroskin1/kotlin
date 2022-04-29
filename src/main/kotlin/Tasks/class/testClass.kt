package `class`

import computer.Computer
import computer.User

fun main () {
//    var an1: Animal = Animal()
//    var an2: Animal = Animal()
//
//    an1.name = "Tigr"
//    an1.age = 21
//    an1.color = "blue"
//    an1.voice = "rrr"
//
//    an2.name = "Cat"
//    an2.age = 22
//    an2.color = "red"
//    an2.voice = "meow"
////
////    an1.info()
////    an1.sayVoice()
////    an2.info()
////    an2.sayVoice()
//
//    var zoo: Zoo = Zoo()
//    zoo.animals[0] = an1
//    zoo.animals[1] = an2
//    zoo.printAllAnimals()

    var user: User = User("Igor", "Putin", arrayOf(computer.Computer(computer.Ssd(), computer.Cpu(), computer.Ram())))
    
}