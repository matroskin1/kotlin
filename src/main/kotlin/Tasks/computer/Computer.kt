package computer

class Computer {
    var ssd: Ssd
    var cpu: Cpu
    var ram: Ram

    constructor(_ssd: Ssd, _cpu: Cpu, _ram: Ram){
        this.ssd = _ssd
        this.cpu = _cpu
        this.ram = _ram
    }
//    constructor(_ssd: Ssd, _ram: Ram){
//        this.ssd = _ssd
//        this.cpu = Cpu()
//        this.ram = _ram
//    }
//    constructor(){
//        this.ssd = Ssd()
//        this.cpu = Cpu()
//        this.ram = Ram()
//    }
    fun printlnComputer(){
        ssd.printlnSsd()
        cpu.printlnCpu()
        ram.printlnRam()
    }

    fun printlnComputer(str: String){
        println(str)
        ssd.printlnSsd()
        cpu.printlnCpu()
        ram.printlnRam()
    }
}


fun test() {
    var ssd: Ssd = Ssd()
    var cpu: Cpu = Cpu()
    var ram: Ram = Ram()

    if (true){
        var computer: Computer = Computer(ssd, cpu, ram)
        computer.printlnComputer()
    }

    //   ssd.size = 512
    ssd.printlnSsd()
    cpu.printlnCpu()
    ram.printlnRam()

//    var notebook: Notebook = Notebook(512, 54.2f, 13, 54.2f, 1024, 87.7f )
    if (true){
        var notebook: Notebook = Notebook(512, 54.2f, 13, 54.2f, 1024, 87.7f )
        notebook.printlnNotebook()
    }
    println("ssd == 512 ? ${if (ssd.size == 512){"yes"} else {"no"}}")
}

fun main(){
   test()
}
