fun main() {
    val a = 12
    val b = 5

    println("Enter operator either +, -, *, /,")
    val operator = readln()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result: $result")

    val num = 100

    when (num) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

    val woi = 11
    val n = "11"

    when (n) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        woi.toString() -> println("Bingo! It's eleven.")
    }
}