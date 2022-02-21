fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    val obj1 = Example()
    val obj2 = Example()

    println(obj1.ageInDays())

//    obj1.age

    val fname = Person("Adesuwa", "Omo", 28)
    var personAge = Person("Omotoyinbo", "Rebecca", 26)

    val dogBreed = Dog("Cavel", 48.2)
    var dogWeight = Dog("Elephant", 50.3)


}