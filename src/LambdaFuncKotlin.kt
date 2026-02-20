fun main() {
    val greeting = { println("Hello World") }
    greeting()

    val product = {a: Int, b: Int -> a * b}
    val result = product(9,3)
    println(result)

    callMe({
        println("Hello World Woi")
    })

    val people = listOf(
        Person("Jack", 34),
        Person("Shelly", 19),
        Person("Patrick", 13),
        Person("Jill", 12),
        Person("Shane", 22),
        Person("Joe", 18)
    )

    val selectedPerson = people.maxBy ({ person -> person.age})

    println(selectedPerson)
    println("name: ${selectedPerson?.name}" )
    println("age: ${selectedPerson?.age}" )

    val selectedPerson2 = people
        .filter { it.name.startsWith("S") }
        .maxBy{ it.age }

    println(selectedPerson2)
    println("name: ${selectedPerson2?.name}" )
    println("age: ${selectedPerson2?.age}" )
}

fun callMe(greeting: () -> Unit){
    greeting()
}

    data class Person(val name: String, val age: Int)

