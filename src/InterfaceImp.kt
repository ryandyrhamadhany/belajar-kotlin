class InterfaceImp : MyInterface {
    override val test: Int = 25
    override fun foo(): String = "Lol"
}

interface A{
    fun callMe() {
        println("From interface A")
    }
}
interface B{
//    fun callMeToo() {
//        println("From interface B")
//    }
    fun callMe() {
        println("From interface B")
    }
}

class Child: A, B{
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}

fun main() {
    val obj = InterfaceImp()
    println("test = ${obj.test}")
    print("Calling hello(): ")
    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())
    println(obj.prop)

    val obj1 = Child()
    obj1.callMe()
}