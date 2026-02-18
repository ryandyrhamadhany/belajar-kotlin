class Point (val x: Int = 0, val y: Int = 10) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

//    operator fun plus(p: Point) = Point(x - p.x, y - p.y) // inline func version
}

class PointDec(var x: Int = 0, var y: Int = 10) {
    operator fun dec() = PointDec(--x, --y)
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")

    var point = PointDec(3, -8)
    --point

    println("point = (${point.x}, ${point.y})")
}