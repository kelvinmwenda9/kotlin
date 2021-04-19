// how to use named parameters in kotlin functions

fun main(){
    printUserInfo(lastName = "Kelvin",firstName =  "Mwenda")
}

fun printUserInfo(firstName: String, lastName: String){
    println("$firstName is $lastName")
}