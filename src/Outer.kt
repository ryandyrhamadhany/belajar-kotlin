class Outer {
    val a = "Outside Nested class."

//    class Nested { // basic inner class
//        val b = "Inside Nested class."
//        fun callMe() = "Function call from inside Nested class."
//    }
    inner class Inner  { // kotlin inner class
        fun callMe() = a
    }
}

fun main() {
    // bacic inner class
//    println(Outer.Nested().b)
//    val nested = Outer.Nested()
//    println(nested.callMe())

    //kotlin inner class
    val outer = Outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")
}