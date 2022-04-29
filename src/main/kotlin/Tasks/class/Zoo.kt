package `class`

class Zoo {
    var animals: Array<Animal> = Array(2,{ Animal() })

    fun printAllAnimals() {
        for (i in 0 until animals.size){
            animals[i].info()
        }
    }
}