package `class`

class Ssd {

    var size: Int
    var speed: Float

    constructor (_size: Int, _speed: Float) {
        this.size = _size
        this.speed = _speed
    }

    constructor () {
        this.size = 512
        this.speed = 3.1F
    }

    constructor (_size: Int) {
        this.size = _size
        this.speed = 5.1F
    }

    fun printlnSsd() {

        println("size: ${size} speed: ${speed}")
    }
}

class Cpu {
    var amountCore: Int
    var mHz: Float

    constructor() {
        this.amountCore = 444
        this.mHz = 4.5f
    }

    constructor(_mHz: Float) {
        this.amountCore = 555
        this.mHz = _mHz
    }

    constructor(_amounCore: Int, _mHz: Float) {
        this.amountCore = _amounCore
        this.mHz = _mHz
    }

    fun printlnCpu() {

        println("amountCore: ${amountCore} mHz: ${mHz}")
    }
}

class Ram {
    var size: Int
    var speed: Float

    constructor(_speed: Float) {
        this.speed = _speed
        this.size = 1000
    }

    constructor() {
        this.size = 23423
        this.speed = 2134.123f
    }

    constructor(_size: Int, _speed: Float) {
        this.size = _size
        this.speed = _speed
    }

    fun printlnRam() {
        println("size: ${size} speed: ${speed}")
    }
}

class Computer {
    var ssd: Ssd
    var cpu: Cpu
    var ram: Ram

    constructor(_ssd: Ssd, _cpu: Cpu, _ram: Ram) {
        this.ssd = _ssd
        this.cpu = _cpu
        this.ram = _ram
    }

    constructor(_ssd: Ssd, _ram: Ram) {
        this.ssd = _ssd
        this.cpu = Cpu()
        this.ram = _ram
    }

    constructor() {
        this.ssd = Ssd()
        this.cpu = Cpu()
        this.ram = Ram()
    }


    fun printlnComputer() {
        ssd.printlnSsd()
        cpu.printlnCpu()
        ram.printlnRam()
    }
}

fun main() {

    var k1: Ssd = Ssd(22, 1.5F)
    var k2: Ssd = Ssd()
    var k3: Ssd = Ssd(1)

    k1.printlnSsd()
    k2.printlnSsd()
    k3.printlnSsd()

    var k4: Cpu = Cpu()
    var k5: Cpu = Cpu(5.6f)
    var k6: Cpu = Cpu(666, 5.3f)

    k4.printlnCpu()
    k5.printlnCpu()
    k6.printlnCpu()

    var k7: Ram = Ram()
    var k8: Ram = Ram(5.4f)
    var k9: Ram = Ram(898, 89.12f)

    k7.printlnRam()
    k8.printlnRam()
    k9.printlnRam()

    var k10: Computer = Computer(Ssd(), Cpu(), Ram())
    var k11: Computer = Computer(Ssd(), Ram())
    var k12: Computer = Computer()

    k10.printlnComputer()
    k11.printlnComputer()
    k12.printlnComputer()

}