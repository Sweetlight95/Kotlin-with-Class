import java.util.*

class Person (val firstname: String, val lastname: String, var age: Int){
    val fname: String
    var personAge: Int
    val lname: String

    init {
        fname = firstname.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        lname = lastname.uppercase()
        personAge = age

        println("First name = $fname")
        println("Last name = $lname")
        println("Person age = $personAge")

    }
}
