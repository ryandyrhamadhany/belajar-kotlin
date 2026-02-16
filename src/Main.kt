fun main() {
    // standard library function
    val number = 5.5
    println("Result = ${Math.sqrt(number)}")

    callMe()

    val number1 = 12.2
    val number2 = 3.4
    val result: Int
    result = addNumbers(number1, number2)
    println("Result = $result")

    println(getName("Ryandy","Rhamadhany"))
    println(getName2("Ryandy","Okeh"))
}

fun callMe(){ // reguler function
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

fun addNumbers(n1: Double, n2 : Double): Int{ // return and parameter function
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"
fun getName2(firstName: String, lastName: String) = "$firstName $lastName"