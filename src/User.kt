data class User(val name: String, val age: Int)

fun main() {
    val jack = User("Jack", 23)
    println("name = ${jack.name}, age = ${jack.age}")

    val u2 = jack.copy(name = "WOi")
    println("name = ${u2.name}, age = ${u2.age}")

    println(jack.toString())

    val u3 = jack.copy()

    println("u1 hashcode = ${jack.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")

    if (jack.equals(u2) == true)
        println("jack is equal to u2.")
    else
        println("jack is not equal to u2.")

    if (jack.equals(u3) == true)
        println("jack is equal to u3.")
    else
        println("jack is not equal to u3.")

    val (name, age) = jack
    println("name = $name")
    println("age = $age")
}