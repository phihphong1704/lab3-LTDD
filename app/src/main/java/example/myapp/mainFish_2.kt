package example.myapp

//7. Use interface delegation

fun makeFish_2() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//
//    println("Shark: ${shark.color}")
//    println("Plecostomus: ${pleco.color}")

    val shark = AquariumFish_2.Shark()
    val pleco = AquariumFish_2.Plecostomus()
    val pleco2 = AquariumFish_2.Plecostomus2()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
    println("Plecostomus 2: ${pleco2.color}")
    pleco2.eat()
}

fun main () {
    makeFish_2()
}