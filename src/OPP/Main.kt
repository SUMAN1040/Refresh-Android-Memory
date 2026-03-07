package OPP

fun main(args: Array<String>) {

    var car1 = Car("Suman", "Red", "Green", 2)

    println("Name is ${car1.name}")
    println("Model is ${car1.model}")
    println(car1.color)
    println(car1.door)

    car1.move()
    car1.stop()
}

class Car(
    var name: String,
    var model: String,
    var color: String,
    var door: Int
) {

    fun move() {
        println("This is a car")
    }

    fun stop() {
        println("This car stopped")
    }
}