package Operator

fun main(){
    val x = 23;
    val y = 2;

    val result = x + y;
    println(result)
    println("${x + y}")
    println("${x - y}")
    println("${x * y}")
    println("${x / y}")
    println("${x % y}")


    println(3*4/3+234*12%9-13)
    var result1 = x + y;
    result1 += 2
    println(result1)

    val isActive = true
    if(!isActive){
        println(1+2)
    }else{
        println(3+4)
    }
}