class PersonOkeh {
    var name: String = "default Value"
        get() = field
        set(value) {
            field = value
        }

    var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val p = PersonOkeh()
    p.name = "jack"
    println("${p.name}")

    p.age = 20
    println("${p.age}")
}