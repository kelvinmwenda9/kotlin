fun main(){
    var user = User()
    user.firstName = "kelvin"
    user.printFullName()

    var friend = User()
    friend.firstName = "mwenda"
    user.printFullName()
}

class User{
    var firstName: String = ""

    fun printFullName(){
        println("$firstName")
    }

}