object Test {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int{
        a = 12
        return a
    }
}

open class Person(){
    fun eat() = println("Eating food")
    fun talk() = println("Talking with people")
    open fun pray() = println("Praying God")
}

//open class Person(name: String, age: Int) { // with primary constructor
//
//    init {
//        println("name: $name, age: $age")
//    }
//
//    fun eat() = println("Eating food.")
//    fun talk() = println("Talking with people.")
//    open fun pray() = println("Praying god.")
//}

fun main() {
    val result: Int

    result = Test.makeMe12()
    println("b = ${Test.b}")
    println("result = $result")

    val muslimin = object : Person(){
        override fun pray() = println("Pray after sholat to Allah")
    }

    muslimin.eat()
    muslimin.talk()
    muslimin.pray()

//    val muslimin = object : Person("Ryandy",21){
//        override fun pray() = println("Pray after sholat to Allah")
//    }
//
//    muslimin.eat()
//    muslimin.talk()
//    muslimin.pray()
}