class Person (val fName: String = "UNKNOWN", val personAge: Int = 0) { // primary Constructor with default Value
    val firstName: String
    var age: Int

    init { // initializer blocks
        firstName = fName.uppercase()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}

fun main() {
    val person = Person("Dmitry", 30)
    println("First Name: ${person.firstName}, Age: ${person.age}")
    val person2 = Person()

}