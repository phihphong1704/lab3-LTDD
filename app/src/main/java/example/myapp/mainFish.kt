package example.myapp
import example.myapp.AquariumFish.Shark
import example.myapp.AquariumFish.Plecostomus

//6. Compare abstract classes and interfaces

fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//
//    println("Shark: ${shark.color}")
//    println("Plecostomus: ${pleco.color}")

    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main () {
    makeFish()
}