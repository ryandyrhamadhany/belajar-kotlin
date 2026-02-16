fun main() {
    val number = 4
    val result: Long

    result = factorial(4)
    println(result)

    val n = 7
    val a = 0
    val b = 1

    println(fibbonacci(n,a,b))
    println(factorial2(5))

}

fun factorial(n: Int):Long{
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}

tailrec fun fibbonacci(n: Int, a:Int, b: Int):Int{
    return if (n == 0) a else fibbonacci(n - 1, b, a + b)
}

tailrec fun factorial2(n: Int, run: Int = 1): Long{
    return if (n == 0) run.toLong() else factorial2(n-1, run*n);
}