// return a value in kotlin
fun main(){
    // var a = sayHi() confirms its returnin a unit
    // println(a)
    var a = sayHi() // to return you save the function in a variable
    println(a)

    sayHi()
}

fun sayHi(): String { // defining return type
    return "hellow"
}