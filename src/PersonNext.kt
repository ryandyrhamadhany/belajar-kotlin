open class PersonNext(age:Int, name:String) {
    init {
        println("My Name is $name")
        println("My Age is $age")
    }
}

class MathTeacher(age:Int, name:String):PersonNext(age, name) { // inheritance
    fun teachMaths(){
        println("I teach in primary school.")
    }
}

class FootBalller(age:Int, name:String):PersonNext(age, name) {
    fun playFootball(){
        println("I play for LA Galaxy..")
    }
}

open class PersonAgain(){
    open var age:Int = 0
        get() = field
        set(value) {
            field = value
        }

    open fun displayAge(age: Int){
        println("My Age is $age")
    }
}

class Girl: PersonAgain(){
//    val name: String = "" // public by default
//    private val name: String = "" // only in this file PersonNext.Kt
//    internal val name: String = "" // visible inside the same module

    override var age: Int = 0
        get() = field
        set(value) {
            field = value - 5
        }
    override fun displayAge(age: Int) {
        super.displayAge(age)
        println("My Fake age is $age")
    }
}

fun main() {
    val t1 = MathTeacher(25,"Woi")
    t1.teachMaths()

    println()

    val f1 = FootBalller(17,"Bola hehe")
    f1.playFootball()

    val girl = Girl()
    girl.displayAge(31);

    girl.age=31
    println("My fake age is ${girl.age}")
}