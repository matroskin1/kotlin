package computer;

public class Notebook {
    var ssd: Ssd
    var cpu: Cpu
    var ram: Ram

    constructor(ssdSize: Int, ssdSpeed: Float, cpuCore: Int, cpuMHz: Float, ramSize: Int, ramSpeed: Float){
        this.ssd = Ssd(ssdSize, ssdSpeed)
        this.cpu = Cpu(cpuCore, cpuMHz)
        this.ram = Ram(ramSize, ramSpeed)
    }

    fun printlnNotebook(){
        println("Notebook:")
        ssd.printlnSsd()
        cpu.printlnCpu()
        ram.printlnRam()
    }

//    constructor(){
//    }
}


