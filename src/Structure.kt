class Structure {

    infix fun createPyramid(rows: Int){
        var k = 0
        for (i in 1..rows){
            k = 0

            for (space in 1..rows-i){
                print("  ")
            }

            while (k != 2*i-1){
                print("* ")
                ++k
            }

            println()
        }
    }
}

fun main() {
    val p = Structure()
    p createPyramid 4

    displayBorder('*') // default argument
    println()
    displayBorder(lenght = 6) // named argument
}

fun displayBorder(Character: Char = '=', lenght: Int = 15){
    for (i in 1..lenght){
        print(Character)
    }
}