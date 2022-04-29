package computer

class Ram {
    var size: Int
    var speed: Float

    constructor(){
        this.size = 8989
        this.speed = 56.56f
    }
    constructor(_size: Int, _speed: Float): this(_speed){
        this.size = _size
    }
    constructor(_speed: Float){
        this.size = 454
        this.speed = _speed
    }
     fun printlnRam(){
         println("Ram size:${size} speed: ${speed}")
     }
}