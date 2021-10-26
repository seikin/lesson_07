/*перегрузка функции родителя*/
fun main() {
    val a = SampleMath01()
    println(a.div(213,12))
    println(a.div(213,0))

    val b = SampleMathDouble01()
    println(b.sum(213,12))

}

open class SampleMath01 {

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun subtr(x: Int, y: Int): Int {
        return x - y
    }

    fun multi(x: Int, y: Int): Int {
        return x * y
    }

    fun div(x: Int, y: Int): Int {
        return if (y == 0) x else x / y
            }
}

class SampleMathDouble01: SampleMath01() {
    fun sum(x: Double, y: Double): Double {
        return x + y
    }

}
