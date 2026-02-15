fun main() {
    val number = -10

    val result = if (number > 0) { // if expression
        "Positive Number"
    }else{
        "Negative Number"
    }

    val result2 = if (number > 0) "Positive Number" else "Negative Number"

    println(result2)

    // ======================================================================

    val a = -9
    val b = -11

    val max = if (a > b){
        println("$a is greater than $b")
        println("max variable holds value of a.")
        a
    }else{
        println("$a is greater than $b")
        println("max variable holds value of b.")
        b
    }

    println("max = $max")

    // ========================================================================

    val numberAgain = 0

    val resultAgain = if (numberAgain > 0)
        "Positif Number"
    else if (numberAgain < 0)
        "Negatif Number"
    else
        "Zero"

    println("number is $resultAgain")

    // =========================================================================

    val n1 = 3
    val n2 = 5
    val n3 = -2

    val maxAgain = if (n1 > n2){
        if (n1 > n3)
            n1
        else
            n3
    }else{
        if (n2 > n3)
            n2
        else
            n3
    }

    println("maxAgain = $maxAgain")
}