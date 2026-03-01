package VarData

fun main() {

    var userName: String = "Suman"
    userName = "Suman Kumar Dey"

    val age: Int = 20
    println("Hello $userName!, Your age is $age");

    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE
    println(integerMinValue)
    println(integerMaxValue)

    println()

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    println(longMinValue)
    println(longMaxValue)

    println()

    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE
    println(floatMinValue)
    println(floatMaxValue)

    println()

    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE
    println(doubleMinValue)
    println(doubleMaxValue)

    println()

    val shortMaxValue = Short.MAX_VALUE
    val shortMinValue = Short.MIN_VALUE
    println(shortMinValue)
    println(shortMaxValue)

    val myNumber = 10F
    val mySecondNumber = 2.5
    println("My number = $myNumber and my second number = $mySecondNumber")

    val myChar = 'D'
    val myBool = true
    println("My char = $myChar")
    println("My bool = $myBool")

}