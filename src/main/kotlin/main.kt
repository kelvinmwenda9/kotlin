fun main(args: Array<String>) {
    println("Hello World!")
    println("This is awesome, finally coding on kotlin")

    //val name = "kelvin"  // val cannot be reassigned in kotlin
    var name = "ann"  // var can be reassigned

    val age: Int = 40
    println("I am ${age} years old")

    name = "mike"

    println("This is my name ${name}")
    println(name.isEmpty())

    var chara: Char = 'a'

    // boolean

    var isBlank: Boolean = false
    println(!isBlank)

    var calories = 1499

    if (calories > 2000){
        println("consumed calories for the day")
    } else if (calories > 1500) {
        println("You have a few more calories left to eat")
    } else {
        println("you still have some calories left")
    }

    var age1 = 9

    if (age1 > 11) println("the age is greater than 10") else println("the age is less than 10")  // if condition is on one line you can define it this way


    // truth tables in kotlin

    //kotlin structural equality
    var name1 = "keen"
    var name2 = "mwee"

    println(name1 != name2)

    // rerential equality
    var a = Person("kelvin")
    var b = Person("jack")

    // numbers, chars, boolean
    println(a !== b)  // false as it does not share the same object/same parts of memory

    // nullable types in kotlin
    var name4: String? = "kev"  // add question tag at the end of the type
    name4 = null

    // nullable safe calls in kotlin
    val length = name4?.length   // null, or return length  // safe calls are used when the var in question is nullable

    // how to use the kotlin elvis operator ?:
    var lastName: String? = "felker"

    var length1:Int = if (lastName != null) lastName.length else 0

    val length2:Int = lastName?.length ?: 0  // if anything in the left side of the elvis operator is null return that value


    // creating a function in kotlin
    helloWorld()

}

fun helloWorld(){
    println("Hello kotlin")
    twoSec()
}

fun twoSec(){
    println("Hello world")
}

class Person(var name: String)