sealed class Expr
class Const(val number: Double) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()

fun eval(e: Expr): Double =
    when (e) {
        is Const -> e.number
        is Sum -> eval(e.left) + eval(e.right)
        NotANumber -> Double.NaN
    }

fun main() {
    // Kita ingin menghitung: 5 + (10 + 2)
    val ekpresi: Expr = Sum(
        Const(5.0),
        Sum(Const(10.0), Const(2.0))
    )

    val hasil = eval(ekpresi)
    println("Hasil perhitungan: $hasil") // Output: 17.0

    // Contoh jika ada NotANumber
    val errorExpr = Sum(Const(1.0), NotANumber)
    println("Hasil error: ${eval(errorExpr)}") // Output: NaN
}