package Array

fun main(args: Array<String>) {
    val names: Array<String> = arrayOf("Suman", "Kumar", "Dey");
    println("Firest element: ${names[0]}");
    println(names.size)

    val num = arrayOf(1, 2, 3, "name 1", "name 2", "name 3");
    for (name in names) {
        println(name);
    }
    println()
    for(i in num){
        if(i is Int){
            println(i)
        }
    }


}