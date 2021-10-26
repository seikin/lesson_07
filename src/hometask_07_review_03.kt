fun main() {
    val z = SampleMath03(11,14)
    println(z.sum())
    println(z.div())

}

open class SampleMath03(var x: Int, var y: Int) {
    open fun sum(): Int {
        return x + y
    }

    open fun div(): Int {
        return if (y == 0) x else x / y
    }
}

class SampleMathDouble03(var a: Double, var b: Double): SampleMath03() {
    override fun sum(): Int {

    }
}