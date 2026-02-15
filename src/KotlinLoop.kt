fun main() {
    var num = 1

    while (num <= 5) {
        println("Line $num")
        ++num
    }

    // =============================================

    var sum: Int = 0
    var input: String

    do {
        println("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()
    }while (input != "0")

    println("sum = $sum")

    // ===========================================

    for (i in 1..5) {
        println("Input $i")
    }

    for (i in 1..5) println(i)
    for (i in 5 downTo  1) println(i)
    for (i in 5 downTo  1 step 2) println(i)

    // =====================================================

    loopLuar@ for (i in 5 downTo 1) {
        loopDalam@ for (j in 5 downTo 1) {
           if (i == 3 && j == 5){
               println("$i $j continue")
               continue@loopLuar
           }
            println("$i $j")
        }
    }
}