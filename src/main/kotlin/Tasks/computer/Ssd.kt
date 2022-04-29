package computer

class Ssd {
    var size: Int
    var speed: Float

    constructor(_size: Int, _speed: Float){
        this.size = _size
        this.speed = _speed
    }
    constructor(_speed: Float){
        this.size = 121
        this.speed = _speed
    }
    constructor(){
        this.size = 12212
        this.speed = 12.2f
    }

    fun printlnSsd(){
        println("Ssd size: ${size} speed: ${speed}")
    }
}
