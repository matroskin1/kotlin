package computer

class User {
    private var name: String
    private var lastName: String
    public var computers: Array<Computer>

    constructor(_name: String, _lastName: String, _computers: Array<Computer>){
        this.name = _name
        this.lastName = _lastName
        this.computers = _computers
    }

    fun printlnUser(){
        println("name: ${name} lastName: ${lastName}")

        for(i in 0 until computers.size){
            println("computer: № ${i+1}")
            computers.get(i).printlnComputer()
        }
    }
}