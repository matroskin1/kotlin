package computer

class Cpu {
    var core: Int
    var mHz: Float

    constructor(_core: Int, _mHz: Float){
        this.core = _core
        this.mHz = _mHz
    }
    constructor(_mHz: Float){
        this.core = 1212
        this.mHz = _mHz
    }
    constructor(){
        this.core = 433
        this.mHz = 12.44f
    }

    fun printlnCpu(){
        println("Cpu: core: ${core} mHz: ${mHz}")
    }
}