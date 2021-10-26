/* hometask #07 by  Alexey Seikin
Смысл задания я не понял. Сужу об этом по количству однотипных операций, которые не могу упростить.
Поэтому задание сделал только для сложения.
Фактически наследования нет. Все классы наследники практически переписываюся заново.

 */
fun main(){
    val a = SampleMath(15,2)
    val b = SampleMathDouble()
    val c = SampleMathFloat()

    println("Сложение - ${a.sum()}, ${b.sum()}, ${c.sum()}")
    println("Вычитание - ${a.subtr()}")
    println("Умножение - ${a.mult()}")

    /*почему результат деления выводится целым числом, без остатка?*/
    println("Деление - ${a.div()}")

}

open class SampleMath(var x: Int, var y: Int) {
    /*Единственное предназначение get-метода — вернуть значение, запрошенное для данного свойства.
    А set-методы получают значение аргумента и используют его для записи значения в свойство.*/



    open fun sum(): Any {
        return x + y
    }

    open fun subtr(): Any {
        return x - y
    }

    open fun mult(): Any {
        return x * y
    }

    open fun div(): Any {
        if (y == 0){
            y += 1
        }
        return x / y
    }

}

class SampleMathDouble(): SampleMath(15 ,2) {
    var xtoDouble: Double = 1.0
        get() = x.toDouble()

    var ytoDouble: Double = 1.0
        get() = y.toDouble()


    override fun sum(): Double {
        return xtoDouble + ytoDouble
    }
}

class SampleMathFloat(): SampleMath(15 ,2) {
    var xtoFloat: Float = 1F
        get() = x.toFloat()

    var ytoFloat: Float = 1F
        get() = y.toFloat()


    override fun sum(): Float {
        return xtoFloat + ytoFloat
    }
}


