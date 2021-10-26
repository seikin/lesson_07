fun main() {
    val a = SampleMath02(10, 8)
    a.sum()
    a.div()
    val b = SampleMathDouble02(11.0, 17.0)
    b.div()


}

open class SampleMath02(var x: Int, var y: Int) {
    open fun sum() {
        println(x + y)
    }

    open fun div() {
        if (y == 0) println(x) else println (x / y)
    }
}

class SampleMathDouble02(var xd: Double, var yd: Double ): SampleMath02(xd.toInt(), yd.toInt()) {
    override fun sum() {
        println(xd + yd)
    }

    override fun div() {
        if (yd == 0.0) println(xd) else println(xd / yd)
    }
}