package LoopAndControlsFlow

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }
    println()

    for (r in 1 until 10) {
        println(r)
    }

    println()

    for (i in 10 downTo 1) {
        println(i)
    }

    println()

    for (i in 1 until 10 step 2) {
        println(i)
    }

    println()

    var number = 0;
    while (number < 10) {
        println("Suman")
        number++;
    }
println()

    var num = 0
    do {
        println("Suman")
        num++
    } while (num < 10)


    for(i in 0..10){
        if(i in 3..8){
            continue
        }
        println(i)
    }


    var x = 0

    outer@ while (x < 10) {
        x++
        println(x)

        var t = 0

        while (t < 5) {
            if (t == 0) {
                println("***$t")
                break@outer
            }
            t++
        }
    }
}