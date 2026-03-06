package LoopAndControlsFlow

fun main() {
    var number = 1
    val lastNumber = 20
    var evenCount = 0

    while (number <= lastNumber) {
        number++

        if (!isEven(number)) {
            continue
        }

        evenCount++
        println(number)
    }

    println("Total even numbers: $evenCount")
}

fun isEven(number: Int) = number % 2 == 0