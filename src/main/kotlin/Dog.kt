import java.util.*

class Dog(breed: String = "UNKNOWN", weight: Double = 0.0) {
    val dogBreed = breed.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var dogWeight = weight

    init{
        println("Dog Breed = $dogBreed")
        println("Dog weight = $dogWeight")
    }
}