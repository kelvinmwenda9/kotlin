// how to overload a function in kotlin

fun main(){
    overLoad("Mwenda")
    overLoad("mwenda", 25)
}

fun overLoad(firstName: String){
    println("Name: $firstName")
}

fun overLoad(firstName: String, age: Int){
    println("Name: $firstName")
}