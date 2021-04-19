// sinle line expressions in kotlin

fun main(){
    sayHello()
    var ab = 11

    if(ab < 10) println("It is less than the minimum")
    else println("It is more than minimum") // single line condition

    fun myName() = println("Kelvin")

    doMark(32)

}

fun sayHello() = println("hello")

// functions with argumwnts
fun doMark(age: Int){
    println("work is happening $age")
}
