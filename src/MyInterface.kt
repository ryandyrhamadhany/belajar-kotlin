interface MyInterface {
    val test: Int
    val prop: Int
        get() = 23

    fun foo(): String

    fun hello(){
        println("Hello there, pal!")
    }

}