// how to default argument values in kotlin

fun main(){
    printUserInf(
            lastName = "Kelvin",
            firstName = "Mwenda",
            lovesPes = false
    )

    printBookInfo("Little Pig", "donn felker", "kelvin") // provide multiple arguments of the same type with vararg

    // use vararg
}

fun printUserInf(firstName: String, lastName: String, lovesPes: Boolean = true){  // boolean tru - defaults lovePes to
    // tru always but changes if lovePes is defined to false ot another value
    println("$firstName is $lastName and $lovesPes")
}

fun printBookInfo(title: String, vararg authors: String){
    println("$title - Authors")
    authors.forEach { println(it) }
}