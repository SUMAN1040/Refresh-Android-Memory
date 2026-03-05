package Functions

fun main(args : Array<String>){
    sayHello("Suman", 22)
    getDate("I am Suman Kumar Dey")
    println(sum(5, 4, 3, 2, 45, 6, 4, 3, 5, 4))
    println(sum2(5, 4, 3, 2, 45, 6, 4, 3, 5, 4))
}

fun sayHello(name: String, age: Int){
    println("Hello $name!, and age $age")
}

fun getDate(data: String){
    println("Your data is: $data")
}

fun sum(vararg number: Int): Int{
    var result = 0
    for(number in number){
        result += number
    }
    return result;
}

fun sum2(vararg number: Int){
    number.forEach { println(it) }
}