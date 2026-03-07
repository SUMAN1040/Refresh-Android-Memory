package Array

fun main(args: Array<String>) {
    val max = maxElement(arrayOf(1, 2, 3, 4))
    println(max)
    val min = minElement(arrayOf(1, 2, 3, 4))
    println(min)
}

fun maxElement(number: Array<Int>): Int {
    var max: Int = number[0];

    for(number: Int in number) {
        if(number > max) {
            max = number;
        }
    }
    return max;
}



fun minElement(number: Array<Int>): Int {
    var min: Int = number[0];

    for(number: Int in number) {
        if(number < min) {
            min = number;
        }
    }
    return min;
}