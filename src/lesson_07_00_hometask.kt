/* hometask #07 by  Alexey Seikin
Используя класс, созданный в процессе прошлой самостоятельной работы,
унаследовать несколько дополнительных классов,
реализующих функционал родителя для типов данных Float, Double
 */
fun main(){
    val a = SampleMath(15,2)

    println("x = ${a.x} ; y = ${a.y}")
    println("Сложение - ${a.sum()}")
    println("Вычитание - ${a.subtr()}")
    println("Умножение - ${a.mult()}")

    /*почему результат деления выводится целым числом, без остатка?*/
    println("Деление - ${a.div()}")

}

open class SampleMath(var x: Int, var y: Int) {

    fun sum(): Int {
        return x + y
    }

    fun subtr(): Int {
        return x - y
    }

    fun mult(): Int {
        return x * y
    }

    fun div(): Int {
        if (y == 0){
            y += 1
        }
        return x / y
    }

}
