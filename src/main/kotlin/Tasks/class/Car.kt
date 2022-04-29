package `class`

class Car{

    var marka: String = ""
    var number: Int = 0
    var color: String = ""

    fun printlnCar(){

        println("marca: $marka number: $number color: $color")
    }


}

class Garage constructor(_garagi: Array<Car>){

    var garagi: Array<Car> = _garagi //= Array (3,{Car()})

    fun printlnGarage(){
        for (i in 0 until garagi.size){
            //var car: Car = garagi[i]
            garagi[i].printlnCar()
        }
    }
}

fun testFun(lol: Car) {
    lol.marka = "BMW"
}


fun  main(){
    var car: Car = Car()
    var car2: Car = car

    var car3: Car = Car()


    car.marka = "Lada"
    car.number = 123
    car.color = "black"

    car2.number = 214

    testFun(car3) //lol = car3
    car.printlnCar()
    car3.printlnCar()
//    var car1: Car = Car()
//    var car2: Car = Car()
//    var cars: Array<Car> = arrayOf(car1, car2)
//    var garage1: Garage = Garage(cars)
//
//
//    car1.marka = "ford"
//    car1.number = 123
//    car1.color = "red"
//
//    car2.marka = "vaz"
//    car2.number = 321
//    car2.color = "blue"
//
//    //car1.printlnCar()
//    //car2.printlnCar()
//    garage1.printlnGarage()




}